(ns logseq.db.frontend.property.util
  "Util fns for building core property concepts"
  (:require [logseq.db.sqlite.util :as sqlite-util]
            [logseq.db.frontend.property.type :as db-property-type]))

(defonce hidden-page-name-prefix "$$$")

(defn- closed-value-new-block
  [page-id block-id value property]
  {:block/type #{"closed value"}
   :block/format :markdown
   :block/uuid block-id
   :block/page page-id
   :block/properties [(sqlite-util/build-property-pair :logseq.property/created-from-property (:db/ident property))]
   :block/schema {:value value}
   :block/parent page-id})

(defn build-closed-value-block
  "Builds a closed value block to be transacted"
  [block-uuid block-value page-id property {:keys [db-ident icon description]}]
  (assert block-uuid (uuid? block-uuid))
  (cond->
   (closed-value-new-block page-id block-uuid block-value property)
    (and db-ident (keyword? db-ident))
    (assoc :db/ident db-ident)

    icon
    (update :block/properties conj (sqlite-util/build-property-pair :logseq.property/icon icon))

    ;; For now, only closed values with :db/ident are built-in?
    (and db-ident (keyword? db-ident))
    sqlite-util/mark-block-as-built-in

    description
    (update :block/schema assoc :description description)

    true
    sqlite-util/block-with-timestamps))

(defn build-property-hidden-page
  "Builds a hidden property page for closed values to be transacted"
  [property]
  (let [page-name (str hidden-page-name-prefix (:block/uuid property))]
    (-> (sqlite-util/build-new-page page-name)
        (assoc :block/type #{"hidden"}))))

(defn build-closed-values
  "Builds all the tx needed for property with closed values including
   the hidden page and closed value blocks as needed"
  [db-ident prop-name property {:keys [translate-closed-page-value-fn property-attributes]
                                :or {translate-closed-page-value-fn identity}}]
  (let [ref-type? (contains? (set (remove #{:default} db-property-type/ref-property-types))
                             (get-in property [:block/schema :type]))
        property-schema (assoc (:block/schema property)
                               :values
                               (if ref-type?
                                 (mapv translate-closed-page-value-fn (:closed-values property))
                                 (mapv :uuid (:closed-values property))))
        property-tx (merge (sqlite-util/build-new-property db-ident property-schema {:original-name prop-name})
                           property-attributes)
        hidden-tx
        ;; closed ref types don't have hidden tx
        (if ref-type?
          []
          (let [page-tx (build-property-hidden-page property-tx)
                closed-value-blocks-tx
                (map (fn [{:keys [db-ident value icon description uuid]}]
                       (build-closed-value-block
                        uuid
                        value
                        [:block/uuid (:block/uuid page-tx)]
                        property
                        {:db-ident db-ident :icon icon :description description}))
                     (:closed-values property))]
            (into [page-tx] closed-value-blocks-tx)))]
    (into [property-tx] hidden-tx)))
