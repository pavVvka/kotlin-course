package org.pavvvka.org.pavvvka.kotlincourse.lesson5

/**
 * Конспект Урока 5.
 */
fun main() {
    var num = ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)
    num = true || false  // true
    println(num)

    priceWithDiscount(123.8, null)
    priceWithDiscount(100.0, 10)

    localization("fr")
    localization("")
    localization(null)

    validateContainerWith("sss")
    validateContainerWith(null)
}

/**
 * Рассчитывает и печатает Стоимость товара со скидкой,
 * если цена известна, а скидка может быть не установлена
 *
 * @param price  Стоимость товара
 * @param discount Скидка, если указана ..Скидка может быть null
 */
fun priceWithDiscount(price: Double, discount: Int?){
    val percentRate = (discount ?: 0) / 100.0
    println(price - price * percentRate)
}

/**
 * печатает язык интерфейса. Если язык не установлен, то напечатать англ
 *
 * @param lang Язык. Если отсутствует, использует значение по умолчанию.
 */
fun localization(lang: String?) {
    val defaultLang = "en"
    println("Language: ${lang ?: defaultLang}")
}

/**
 * Инвентаризация на складе: Убедиться, что в каждом контейнере есть товары.
 * Иначе, сообщить об ошибке
 */
fun validateContainerWith(goods: String?) {
    println("Container is not empty: ${goods ?: throw Exception("is empty")} ")
}
val ee = !(7 + 0 != 7)
val e1e = true  || false && false
val hh = 9 - 4 != 5
class LessonSummary {
}