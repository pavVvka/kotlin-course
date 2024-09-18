@file:Suppress("LanguageDetectionInspection")

package org.pavvvka.org.pavvvka.kotlincourse.lesson3

// Название мероприятия
const val EVENT_NAME: String = "Hahathon Survival"
// Место проведения
const val EVENT_ADDRESS_MAIN: String = "Moscow, B.Polyanka st."

class Lesson3 {

    // Дата проведения
    val eventDateString: String = "10 января 1999"
    // Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    val detailedEventBudget: String by lazy { "Total budget: ${someFunction()}" }
    // Количество участников
    var participantsQuantity: Int = 0
    // Длительность хакатона
    val eventDuration: Int = 2
    // Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    val suppliersTerms: String by lazy { "Suppliers Contacts and terms of agreements: ${someFunction()}" }
    // Текущее состояние хакатона (статус)
    var eventStatus: String = "not defined"
        get() = field
        set(value) {
            field = value
        }
    // Список спонсоров
    val sponsorsList: String by lazy { "Suppliers: ${someFunction()}" }
    // Бюджет мероприятия
    val totalBudget: Double = 20.0
    // Текущий уровень доступа к интернету
    var internetAccess: Int = 0
        get() = field
        set(value) {
            field = value
        }
    // Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    val logisticInfo: String by lazy { "Info: ${someFunction()}" }
    // Количество команд
    var teamQuantity: Int = 0
    // Перечень задач
    val tasks: String = "List"
    // План эвакуации
    val evacuationPlan: String = "Some plan"
    // Список доступного оборудования
    val availableEquipmentList: String = "Some list"
    // Список свободного оборудования
    val freeEquipmentList: String by lazy { "Equipment: ${someFunction()}" }
    // График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    val mealSchedule: String by lazy { "Equipment: ${someFunction()}" }
    // План мероприятий на случай сбоев
    val extraPlan: String = "Plan"
    // Список экспертов и жюри
    var expertsList: String = "List"
    // Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
    val feedbackResult: String by lazy { "Result: ${someFunction()}" }
    // Политика конфиденциальности
    val policy: String = "Policy"
    // Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    var participantsFeedbacks: String = ""
        get() = field
        set(value) {
            if(value.isNotEmpty()){
                    field = value
                }
        }
    // Текущая температура в помещении
    var currentTemperature: Double = 20.0
    // Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
    val networkStatus: String by lazy { "Result: ${someFunction()}" }
    // Уровень освещения
    var lightingLevel: String = "2"
    // Лог событий мероприятия
    var logs: String = "logs"
    // Доступность медицинской помощи
    var isMedicineAvailable: Boolean = false
    // Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    var safetyPlan: String = "plan"
    // Регистрационный номер мероприятия
    val eventId: Int = 12
    // Максимально допустимый уровень шума в помещении хакатона.
    val maxDb: Int = 100
    // Индикатор превышения уровня шума в помещениях
    var overNoise: Boolean = false
    // Формат мероприятия (зависит от геополитической обстановки)
    var eventFormat: String = "format 1"
    // Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
    var placesFree: Int = 10
        get() = field
        set(value) {
            if(value >= 0) {
                field = value
            }
        }
    // План взаимодействия с прессой
    val pressRules: String = "plan"
    // Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    val teamDetails: String by lazy { "Info: ${someFunction()}" }
    // Статус получения всех необходимых разрешений
    lateinit var restrictionsStatus: String
    // Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
    var isAccessOpen: Boolean = false
        set(value) {
            if(value != field) {
                field = value
            }
        }
    // Список партнеров мероприятия
    val partners: String = "list"
    // Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    lateinit var result: String
    val report: String by lazy { "Report: ${someFunction()}" }
    // План распределения призов
    val presentsPlan: String = "plan"
    // Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
    val specialContacts: String = "contacts"
    // Особые условия для участников с ограниченными возможностями
    val specialTerms: String = "terms"
    // Общее настроение участников (определяется опросами)
    var satisfactionRate: String = "low"
        get() = field
        set(value) {
            field = value
        }
    // Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
    val detailedPlan: String by lazy { "detailedPlan" }
    // Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
    lateinit var specialGuest: String
    // Максимальное количество людей, которое может вместить место проведения.
    val capacityMax: Int = 100
    // Стандартное количество часов, отведенное каждой команде для работы над проектом.
    val timeSession: Int = 4

    private fun someFunction() {
        return
    }
}