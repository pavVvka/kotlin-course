package org.pavvvka.org.pavvvka.kotlincourse.lesson5

/**
 * Домашнее задание. Урок 5. Часть 2 с задачками.
 */
fun main() {
    println("   <soundIntensity>")
    println(soundIntensity(5.0))
    println(soundIntensity(null))

    println("\n   <totalDeliveryPrice>")
    totalDeliveryPrice(200.0)
    totalDeliveryPrice(null)

    println("\n   <fixCurrentPressure>")
    fixCurrentPressure(70.0)
    fixCurrentPressure(null)
}

/**
 * Рассчитывает и распечатывает интенсивность.
 *
 * @param intensityRate Коэффициент.
 * Если коэффициент отсутствует, то учитывается коэффициент по умолчанию.
 */
fun soundIntensity(intensityRate: Double?) {
    val startIntensity = 80
    val defaultRate = 0.5
    println(startIntensity * (intensityRate ?: defaultRate))
}

/**
 * Рассчитывает и распечатывает стоимость доставки груза с учетом страховки.
 *
 * @param price Стоимость груза без страховки.
 * Если стоимость отсутствует, то учитывается стоимость по умолчанию.
 */
fun totalDeliveryPrice(price: Double?) {
    val insuranceRate = 0.5
    val defaultDelivery = 50.0
    println((price ?: defaultDelivery) * (1 + insuranceRate))
}

/**
 * Распечатывает полученный аргумент или сообщение, если параметр отсутствует.
 *
 * @param pressure Атмосферное давление.
 * Если значение отсутствует, то выбрасывает исключение IllegalArgumentException.
 */
fun fixCurrentPressure(pressure: Double?) {
    val fixedPressure = pressure ?: throw IllegalArgumentException("Missing pressure value")
    println(fixedPressure)
}

class Lesson5 {
}