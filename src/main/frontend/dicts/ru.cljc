(ns frontend.dicts.ru
  "Provides translation to RU"
  #?(:cljs (:require [shadow.resource :as rc])))

(def dict
  {:accessibility/skip-to-main-content "Перейти к основному содержимому"
   :tutorial/text #?(:cljs (rc/inline "tutorial-ru.md")
                     :default "tutorial-ru.md")
   :tutorial/dummy-notes #?(:cljs (rc/inline "dummy-notes-ru.md")
                            :default "dummy-notes-ru.md")
   :on-boarding/demo-graph "Это демонстрационный граф, изменения не будут сохранены, пока вы не откроете локальный файл."
   :on-boarding/add-graph "Добавить новый граф"
   :on-boarding/open-local-dir "Открыть локальный каталог"
   :on-boarding/new-graph-desc-1 "Logseq поддерживает Markdown и Org-mode. Вы можете открыть существующий каталог или создать новый на вашем устройства, каталог также можно назвать просто папкой. Ваши данные будут храниться только на вашем устройстве."
   :on-boarding/new-graph-desc-2 "После того, как вы укажете каталог, в нём будут созданы три папки:"
   :on-boarding/new-graph-desc-3 "/journals - хранит страницы ваших журналов"
   :on-boarding/new-graph-desc-4 "/pages - хранит остальные страницы"
   :on-boarding/new-graph-desc-5 "/logseq - хранит конфигурации, custom.css, и другие метаданные."
   :on-boarding/welcome-whiteboard-modal-title "Новый холст для ваших мыслей."
   :on-boarding/welcome-whiteboard-modal-description "Интерактивные доски - отличный инструмент для мозгового штурма и самоорганизации. Теперь вы можете разместить любые свои мысли из базы знаний или новые мысли рядом друг с другом на пространственном холсте, чтобы соединить, ассоциировать и понять по-новому"
   :on-boarding/welcome-whiteboard-modal-skip "Пропустить"
   :on-boarding/welcome-whiteboard-modal-start "Начать работу с интерактивной доской"
   :on-boarding/tour-whiteboard-home "{1} Дом для ваших досок"
   :on-boarding/tour-whiteboard-home-description "Интерактивные доски имеют свой собственный раздел в приложении, где их сразу можно увидеть, создать новые или удалить."
   :on-boarding/tour-whiteboard-new "{1} Создать новую интерактивную доску"
   :on-boarding/tour-whiteboard-new-description "Существует несколько способов создания новой интерактивной доски. Один из них всегда находится прямо здесь, на панели управления."
   :help/start "Начало работы"
   :help/about "О Logseq"
   :help/roadmap "Дорожная карта"
   :help/bug "Сообщить об ошибке"
   :help/feature "Предложить улучшение"
   :help/changelog "Список изменений"
   :help/blog "Блог Logseq"
   :help/docs "Документация"
   :help/privacy "Политика конфиденциальности"
   :help/terms "Условия"
   :help/forum-community "Форум сообщества"
   :help/awesome-logseq "Потрясающий Logseq"
   :help/shortcuts "Сочетания клавиш"
   :help/shortcuts-triggers "Действия"
   :help/shortcut "Горячие клавиши"
   :help/slash-autocomplete "Слэш - автодополнение"
   :help/block-content-autocomplete "Блок контента - автодополнение"
   :help/reference-autocomplete "Автодополнение ссылок на страницу"
   :help/block-reference "Ссылка на блок"
   :help/open-link-in-sidebar "Открыть ссылку в боковой панели"
   :more "Больше"
   :search/result-for "Искать результат для "
   :search/items "элементы"
   :search/page-names "Искать имена страниц"
   :search-item/whiteboard "Интерактивная доска"
   :search-item/page "Страница"
   :search-item/file "Файл"
   :search-item/block "Блок"
   :help/context-menu "Контекстное меню блока"
   :help/markdown-syntax "Markdown синтаксис"
   :help/org-mode-syntax "Org-mode синтаксис"
   :bold "Жирный"
   :italics "Курсив"
   :highlight "Выделение"
   :strikethrough "Перечёркнутый"
   :code "Код"
   :untitled "Без названия"
   :right-side-bar/help "Справка"
   :right-side-bar/switch-theme "Тема"
   :right-side-bar/contents "Содержание"
   :right-side-bar/page-graph "Граф страницы"
   :right-side-bar/block-ref "Ссылка на блок"
   :right-side-bar/graph-view "Визуальный граф"
   :right-side-bar/all-pages "Все страницы"
   :right-side-bar/whiteboards "Интерактивные доски"
   :right-side-bar/flashcards "Карточки"
   :right-side-bar/new-page "Новая страница"
   :right-side-bar/show-journals "Показать журналы"
   :right-side-bar/separator "Изменение размера правой боковой панели"
   :left-side-bar/journals "Журналы"
   :left-side-bar/create "Создать"
   :left-side-bar/new-page "Новая страница"
   :left-side-bar/new-whiteboard "Новая интерактивная доска"
   :left-side-bar/nav-favorites "Избранное"
   :left-side-bar/nav-recent-pages "Недавнее"
   :page/something-went-wrong "Что-то пошло не так"
   :page/logseq-is-having-a-problem "У Logseq возникла проблема. Чтобы попытаться вернуть его в рабочее состояние, пожалуйста, попробуйте выполнить следующие безопасные шаги по порядку:"
   :page/step "Шаг {1}"
   :page/try "Попробовать"
   :page/presentation-mode "Презентация"
   :page/delete-confirmation "Вы уверены, что хотите удалить эту страницу и ее файл?"
   :page/open-in-finder "Открыть в каталоге"
   :page/open-with-default-app "Открыть в приложении по умолчанию"
   :page/make-public "Сделать доступной для публикации"
   :page/version-history "Просмотр истории страницы"
   :page/open-backup-directory "Открыть каталог резервных копий"
   :page/make-private "Сделать приватной"
   :page/delete "Удалить страницу"
   :page/add-to-favorites "Добавить в Избранное"
   :page/unfavorite "Удалить из Избранного"
   :page/show-journals "Показать журналы"
   :page/show-whiteboards "Показать интерактивные доски"
   :block/name "Имя страницы"
   :page/earlier "Ранее"
   :page/copy-page-url "Копировать URL страницы"
   :file/name "Имя файла"
   :file/last-modified-at "Последнее изменение"
   :file/no-data "Нет данных"
   :file/format-not-supported "Расширение .{1} не поддерживается."
   :file/validate-existing-file-error "Страница уже существует с другим файлом: {1}, текущий файл: {2}. Пожалуйста, оставьте только один из них и переиндексируйте ваш граф."
   :file-rn/re-index "Настоятельно рекомендуется повторить индексацию после переименования файлов и синхронизации на других устройствах."
   :file-rn/need-action "Предлагается выполнить действия по переименованию файлов, чтобы они соответствовали новому формату. Переиндексация требуется на всех устройствах после синхронизации переименованных файлов."
   :file-rn/or-select-actions " или переименовать файлы ниже по отдельности, затем "
   :file-rn/or-select-actions-2 ". Эти действия будут недоступны после закрытия этой панели."
   :file-rn/legend "🟢 Необязательные действия по переименованию; 🟡 Действие по переименованию, необходимое для предотвращения изменения заголовка; 🔴 Обязательное изменение."
   :file-rn/close-panel "Закрыть панель"
   :file-rn/all-action "Применить все действия!"
   :file-rn/select-format "(Опция режима разработчика. Опасно!) Выберите формат имени файла"
   :file-rn/rename "переименовать файл \"{1}\" в \"{2}\""
   :file-rn/apply-rename "Применить операцию переименования файла"
   :file-rn/suggest-rename "Требуется действие: "
   :file-rn/otherwise-breaking "Или заголовок станет"
   :file-rn/no-action "Отлично! Дальнейших действий не требуется."
   :file-rn/confirm-proceed "Обновить формат!"
   :file-rn/select-confirm-proceed "Dev: формат записи"
   :file-rn/unreachable-title "Внимание! Имя страницы станет {1} при текущем формате имени файла, если `title::` не задано вручную"
   :file-rn/optional-rename "Предложение: "
   :file-rn/format-deprecated "В настоящее время вы используете устаревший формат. Настоятельно рекомендуется обновить формат до последней версии. Пожалуйста, создайте резервную копию данных и закройте клиенты Logseq на других устройствах перед началом операции."
   :file-rn/filename-desc-1 "Этот параметр определяет способ сохранения страницы в файл. Logseq сохраняет страницу в файл с таким же именем."
   :file-rn/filename-desc-2 "Некоторые символы, такие как \"/\" или \"?\" недопустимы для имени файла."
   :file-rn/filename-desc-3 "Logseq заменяет недопустимые символы их эквивалентом в кодировке URL, чтобы сделать их допустимыми (например, \"?\" становится \"%3F\")."
   :file-rn/filename-desc-4 "Разделитель пространства имен \"/\" также заменяется на \"___\" (тройное подчеркивание) из эстетических соображений."
   :file-rn/instruct-1 "Этот процесс обновления формата имен файлов состоит из двух этапов:"
   :file-rn/instruct-2 "1. Нажмите "
   :file-rn/instruct-3 "2. Следуйте приведенным ниже инструкциям, чтобы переименовать файлы в новый формат:"
   :page/created-at "Создан в"
   :page/updated-at "Обновлен в"
   :page/backlinks "Обратные ссылки"
   :linked-references/filter-search "Поиск в связанных страницах"
   :editor/block-search "Поиск блока"
   :text/image "Изображение"
   :asset/show-in-folder "Показать изображение в папке"
   :asset/open-in-browser "Открыть изображение в браузере"
   :asset/delete "Удалить изображение"
   :asset/copy "Копировать изображение"
   :asset/maximize "Увеличить изображение"
   :asset/confirm-delete "Вы уверены, что хотите удалить {1}?"
   :asset/physical-delete "Также удалить файл (обратите внимание, что его нельзя будет восстановить)"
   :color/gray "Серый"
   :color/red "Красный"
   :color/yellow "Желтый"
   :color/green "Зеленый"
   :color/blue "Синий"
   :color/purple "Фиолетовый"
   :color/pink "Розовый"
   :editor/copy "Копировать"
   :editor/cut "Вырезать"
   :content/copy-block-ref "Копировать ссылку блока"
   :content/copy-block-emebed "Копировать встроенный блок"
   :content/open-in-sidebar "Открыть в боковой панели"
   :content/click-to-edit "Нажмите для редактирования"
   :settings-page/git-confirm "Необходимо перезапустить приложение после изменения настроек Git."
   :settings-page/git-switcher-label "Включить автокоммит в Git"
   :settings-page/git-commit-delay "Задержка автокоммита Git в секундах"
   :settings-page/edit-config-edn "Редактировать config.edn"
   :settings-page/edit-global-config-edn "Редактировать глобальный config.edn"
   :settings-page/edit-custom-css "Редактировать custom.css"
   :settings-page/edit-export-css "Редактировать export.css"
   :settings-page/edit-setting "Редактировать"
   :settings-page/custom-configuration "Настройки пользователя"
   :settings-page/custom-global-configuration "Глобальные настройки пользователя"
   :settings-page/custom-theme "Тема пользователя"
   :settings-page/export-theme "Экспорт темы"
   :settings-page/show-brackets "Показывать скобки"
   :settings-page/spell-checker "Проверка орфографии"
   :settings-page/auto-updater "Обновлять автоматически"
   :settings-page/disable-sentry "Отправлять данные использования и диагностики в Logseq"
   :settings-page/disable-sentry-desc "Logseq никогда не будет собирать вашу локальную базу данных графов или продавать ваши данные"
   :settings-page/preferred-outdenting "Логические отступы"
   :settings-page/show-full-blocks "Показать все строки в ссылке на блок"
   :settings-page/auto-expand-block-refs "Автоматически раскрывать ссылки на блок при увеличении масштаба"
   :settings-page/custom-date-format "Формат даты"
   :settings-page/custom-date-format-warning "Требуется переиндексация! Существующие ссылки на журналы будут нарушены!"
   :settings-page/preferred-file-format "Предпочитаемый формат файлов"
   :settings-page/preferred-workflow "Предпочтительный рабочий процесс"
   :settings-page/preferred-pasting-file "Предпочтительнее вставлять файл"
   :settings-page/enable-shortcut-tooltip "Всплывающие подсказки горячих клавиш"
   :settings-page/enable-timetracking "Отслеживание времени"
   :settings-page/enable-tooltip "Всплывающие подсказки"
   :settings-page/enable-journals "Журналы"
   :settings-page/enable-all-pages-public "При публикации все страницы становятся публичными"
   :settings-page/customize-shortcuts "Сочетания клавиш"
   :settings-page/shortcut-settings "Настроить горячие клавиши"
   :settings-page/home-default-page "Установить домашнюю страницу по умолчанию"
   :settings-page/enable-block-time "Временные метки блока"
   :settings-page/clear-cache "Очистить кэш"
   :settings-page/clear "Очистить"
   :settings-page/clear-cache-warning "Очистка кэша приведет к удалению открытых графов. Вы потеряете несохраненные изменения."
   :settings-page/developer-mode "Режим разработчика"
   :settings-page/developer-mode-desc "Режим разработчика помогает людям, участвующим в разработке расширений, более эффективно тестировать свои интеграции с Logseq"
   :settings-page/current-version "Версия"
   :settings-page/tab-general "Общие"
   :settings-page/tab-editor "Редактор"
   :settings-page/tab-version-control "Управление версиями"
   :settings-page/tab-advanced "Продвинутые"
   :settings-page/tab-assets "Объекты"
   :settings-page/tab-features "Особенные"
   :settings-page/plugin-system "Расширения"
   :settings-page/enable-flashcards "Карточки"
   :settings-page/network-proxy "Прокси-сервер"
   :settings-page/filename-format "Формат имени файла"
   :settings-page/alpha-features "Альфа-функции"
   :settings-page/beta-features "Бета-функции"
   :settings-page/login-prompt "Чтобы получить доступ к новым функциям раньше других, вы должны быть открытым коллективным спонсором или сторонником Logseq и, следовательно, войти в систему первым."
   :settings-page/sync "Синхронизация"
   :settings-page/enable-whiteboards "Интерактивные доски"
   :yes "Да"

   :submit "Подтвердить"
   :cancel "Отмена"
   :close "Закрыть"
   :delete "Удалить"
   :save "Сохранить"
   :type "Тип"
   :host "Хост"
   :port "Порт"
   :re-index "Переиндексация"
   :re-index-detail "Переиндексировать граф"
   :re-index-multiple-windows-warning "Перед переиндексацией этого графа необходимо закрыть другие окна."
   :re-index-discard-unsaved-changes-warning "Переиндексация удалит текущий граф, а затем снова обработает все файлы в том виде, в каком они в данный момент хранятся на диске. Вы потеряете несохраненные изменения, и это может занять некоторое время. Продолжить?"
   :open-new-window "Новое окно"
   :sync-from-local-files "Обновить"
   :sync-from-local-files-detail "Импортировать изменения из локальных файлов"
   :sync-from-local-changes-detected "При обновлении будут найдены и обработаны файлы, изменённые на диске и отличающиеся от текущего содержимого страниц Logseq. Продолжить?"

   :search/publishing "Искать"
   :search "Искать или создать страницу"
   :whiteboard/link-whiteboard-or-block "Ссылка на доску/страницу/блок"
   :page-search "Искать на текущей странице"
   :graph-search "Искать граф"
   :new-page "Новая страница"
   :new-whiteboard "Новая интерактивная доска"
   :new-graph "Добавить новый граф"
   :graph "Граф"
   :graph/persist "Logseq синхронизирует внутреннее состояние, пожалуйста, подождите несколько секунд."
   :graph/persist-error "Не удалось выполнить внутреннюю синхронизацию состояния."
   :graph/save "Сохранение..."
   :graph/save-success "Успешно сохранено"
   :graph/save-error "Сохранить не удалось"
   :graph/all-graphs "Все графы"
   :graph/local-graphs "Локальные графы"
   :graph/remote-graphs "Удаленные(remote) графы"
   :export "Экспорт"
   :export-graph "Экспортировать граф"
   :export-page "Экспортировать страницу"
   :export-markdown "Экспортировать как стандартный Markdown (без свойств блока)"
   :export-opml "Экспортировать как OPML"
   :export-public-pages "Экспорт публичных страниц"
   :export-json "Экспортировать как JSON"
   :export-roam-json "Экспортировать как Roam JSON"
   :export-edn "Экспортировать как EDN"
   :all-graphs "Все графы"
   :all-pages "Все страницы"
   :all-whiteboards "Все интерактивные доски"
   :all-files "Все файлы"
   :remove-orphaned-pages "Удалить страницы без родителя"
   :all-journals "Все журналы"
   :settings "Настройки"
   :settings-of-plugins "Расширения"
   :plugins "Расширения"
   :themes "Темы"
   :relaunch-confirm-to-work "Необходимо перезапустить приложение, чтобы оно заработало. Перезапустить его сейчас?"
   :import "Импорт"
   :importing "Импортирование"
   :join-community "Присоединиться к сообществу"
   :discourse-title "Наш форум!"
   :help-shortcut-title "Нажмите для просмотра горячих клавиш и других советов"
   :loading "Загрузка"
   :parsing-files "Анализ файлов"
   :loading-files "Загрузка файлов"
   :login "Вход в систему"
   :logout "Выйти"
   :download "Скачать"
   :language "Язык"
   :remove-background "Удалить фон"
   :remove-heading "Удалить заголовок"
   :heading "Заголовок {1}"
   :auto-heading "Автоматический заголовок"
   :open-a-directory "Открыть локальный каталог"

   :help/shortcut-page-title "Сочетания клавиш"

   :plugin/installed "Установлено"
   :plugin/not-installed "Не установлено"
   :plugin/installing "Установка"
   :plugin/install "Установить"
   :plugin/reload "Перезагрузить"
   :plugin/update "Обновить"
   :plugin/check-update "Проверить обновления"
   :plugin/check-all-updates "Проверить все обновления"
   :plugin/refresh-lists "Обновить списки"
   :plugin/enabled "Включено"
   :plugin/disabled "Отключено"
   :plugin/update-available "Доступно обновление"
   :plugin/updating "Обновление"
   :plugin/uninstall "Удаление"
   :plugin/marketplace "Каталог расширений"
   :plugin/downloads "Загрузки"
   :plugin/stars "Звёзды"
   :plugin/title "Название"
   :plugin/all "Все"
   :plugin/unpacked "Распаковано"
   :plugin/delete-alert "Вы уверены, что хотите удалить расширение [{1}]?"
   :plugin/open-settings "Открыть настройки"
   :plugin/open-package "Открыть пакет"
   :plugin/load-unpacked "Загрузить распакованное расширение"
   :plugin/restart "Перезапустить приложение"
   :plugin/unpacked-tips "Выбрать папку для расширений"
   :plugin/contribute "✨ Написать и отправить новое расширение"
   :plugin/up-to-date "Обновлено"
   :plugin/custom-js-alert "Найден файл custom.js, выполнить его? (Если вы не понимаете содержание этого файла, рекомендуется не разрешать его выполнение, поскольку оно сопряжено с определенными рисками для безопасности)."
   :plugin.install-from-file/menu-title "Установить из plugins.edn"
   :plugin.install-from-file/title "Установить расширения из plugins.edn"
   :plugin.install-from-file/notice "Следующие плагины заменят ваши плагины:"
   :plugin.install-from-file/success "Все расширения установлены!"

   :pdf/copy-ref "Копировать ссылку"
   :pdf/copy-text "Копировать текст"
   :pdf/linked-ref "Связанные ссылки"
   :pdf/toggle-dashed "Пунктирный стиль для выделения области"
   :pdf/hl-block-colored "Цветная метка для выделенного блока"
   :pdf/doc-metadata "Метаданные документа"

   :updater/new-version-install "Была загружена новая версия"
   :updater/quit-and-install "Перезапустить для установки"

   :paginates/pages "Всего {1} страниц(а)"
   :paginates/prev "Предыдущая"
   :paginates/next "Следующая"

   :tips/all-done "Всё готово"

   :command-palette/prompt "Введите команду"
   :select/default-prompt "Выберите"
   :select/default-select-multiple "Выберите один или несколько"
   :select.graph/prompt "Выберите граф"
   :select.graph/empty-placeholder-description "Нет подходящих графов. Хотите добавить другой?"
   :select.graph/add-graph "Да, добавить другой граф"

   :file-sync/other-user-graph "Текущий локальный граф привязан к удаленному графу другого пользователя. Поэтому синхронизацию начать нельзя."
   :file-sync/graph-deleted "Текущий удаленный граф был удален"

   :notification/clear-all "Очистить всё"})
