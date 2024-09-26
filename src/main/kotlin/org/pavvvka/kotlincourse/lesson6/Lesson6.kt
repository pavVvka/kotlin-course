package org.pavvvka.kotlincourse.lesson6

fun main() {

    println("\nЗадание 1: <Определение Сезона>")
    println("Season is: ${getSeason(12)}")
//    println("Season is: ${getSeason(null)}")
    println("Season is: ${getSeason(-1)}")
    println("Season is: ${getSeason(13)}")
    println()

    println("\nЗадание 2: <Расчет Возраста Питомца>")
    println("The Pet`s age as human is: ${getPetAge(0.5)}")
    println("The Pet`s age as human is: ${getPetAge(1.0)}")
    println("The Pet`s age as human is: ${getPetAge(2.0)}")
    println("The Pet`s age as human is: ${getPetAge(10.0)}")
//    println("The Pet`s age is: ${getPetAge(null)}")

    println("\nЗадание 3: <Определение Вида Транспорта>")
    println(chooseTransport(1))
    println(chooseTransport(-1))
    println(chooseTransport(5))
    println(chooseTransport(100))

    println("\nЗадание 4: <Расчет Бонусных Баллов>")
    println(calculateBonusPoints(1000))
    println(calculateBonusPoints(1099))
    println(calculateBonusPoints(1100))
    println(calculateBonusPoints(20))

    println("\nЗадание 5: Определение Типа Документа")
    println(getDocType(null))
    println(getDocType("png"))

    println("\nЗадание 6: \"Конвертация Температуры\"")
    println(convertTemperatureFormat(36.6, "C"))
    println(convertTemperatureFormat(98.6, "F"))
//    println(convertTemperatureFormat(null, "F"))
//    println(convertTemperatureFormat(36.6, null))

    println("\nЗадание 7: Подбор Одежды по Погоде")
    println(getCloth(12))
    println("\nЗадание 8: \"Выбор Фильма по Возрасту")
    println(chooseFilmByAge(5))
}

/**
 * Задание 8: "Выбор Фильма по Возрасту"
 */
fun chooseFilmByAge(age: Int): String {
    return when {
        age < 0 -> "Ещё не родился"
        age < 6 -> "Детский"
        age < 18 -> "Подростковый"
        else -> "Взрослый"
    }
}

/**
 * Задание 7: "Подбор Одежды по Погоде"
 */
fun getCloth(temp: Int): String {
    return when {
        temp < -30 || temp > 35 -> "Не выходи"
        temp < 0 -> "куртка и шапка"
        temp in 0..15 -> "ветровка"
        else -> "футболка и шорты"
    }
}

/**
 * Задание 6: "Конвертация Температуры"
 */
fun convertTemperatureFormat(temp: Double?, format: String?): String {
    temp ?: throw IllegalArgumentException("Значение температуры не полученно")
    return when (format) {
        null -> "Формат температуры отсутствует"
        "C" -> "t. is ${temp * 9 / 5 + 32} F"
        "F" -> "t. is ${(temp - 32) / 1.8} C"
        else -> "Формат не распознан"
    }
}

/**
 * Задание 5: "Определение Типа Документа"
 */
fun getDocType(type: String?): String {
    return when (type) {
        null -> "Значение не получено"
        "txt" -> "Текстовый документ"
        "jpg", "png" -> "Изображение"
        "xml" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

/**
 * Задание 4: "Расчет Бонусных Баллов"
 */
fun calculateBonusPoints(purchase: Int): Int {
//fun calculateBonusPoints(purchase: Double): Double {
    val rate = (purchase / 100)

    /* для Double */
//    return when {
//        rate < 0 -> throw Exception("")
//        rate in 1.0..10.0 -> rate * 2
//        rate > 10 -> rate * 5 - 30
//        else -> 0.0
//    }

    /* для Int */
    return  when {
        rate < 0 -> throw Exception("")
        rate < 1 -> 0
        rate < 11 -> rate * 2
        else -> rate * 5 - 30
    }
}

/**
 * Задание 3: "Определение Вида Транспорта"
 * исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
 *
 */
fun chooseTransport(rootLength: Int): String {
    return when {
        rootLength < 0 -> "вы на месте"
        rootLength < 2 -> "пешком"
//        rootLength in 0..1 -> "пешком"
        rootLength < 6 -> "велосипед"
//        rootLength in 2..5 -> "велосипед"
        else -> "автотранспорт"
    }
}

/**
 * Задание 2: "Расчет Возраста Питомца"
 * Расчет возраста питомца.
 *
 * @param age Количество лет питомца. Может быть null.
 * @return Количество лет в проекции человека. Если [age] == null, то [Exception].
 */
fun getPetAge(age: Double?): Double {
    val petAgeBefore3 = 10.5
    val petAgeAfter2 = 4.0
    return if ((age ?: throw Exception ("Age is empty")) < 3) {
        petAgeBefore3 * age
    } else {
        petAgeBefore3 * 2 + petAgeAfter2 * (age - 2)
    }
}

/**
 * Задание 1: "Определение Сезона"
 * Определяет сезон года.
 *
 * @param monthNumber Номер месяца.
 * @return Название сезона.
 */
fun getSeason(monthNumber: Int?): String {
    if ((monthNumber ?: throw IllegalArgumentException("Missing monthNumber")) < 1 || monthNumber > 12) {
        return "month number could be in range between 1 and 12"
    }

    return if (monthNumber !in 1..12) {
        "Неверно указан месяц"
    } else if (monthNumber > 8) {
        "Autumn"
    } else if (monthNumber > 5) {
        "Summer"
    } else if (monthNumber > 2) {
        "Spring"
    } else
        "Winter"
}

class Lesson6 {
}