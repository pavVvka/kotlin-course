package org.pavvvka.kotlincourse.lesson6

fun main() {

    // Диапазоны
    val intRange: IntRange = -1..13 //возрастающий, включительно
    val intRangeUntil = 1 until 10 // диапазон
    val downTo = 10 downTo 1
    val charRange: CharRange = 'd'..'r'
    val inRange = 2 in intRange // boolean
    val notInRange = 20 !in intRange // boolean

    println(inRange) // 1..10
    println(inRange) // true

//    when (значение) {
//        выражение1 -> {/*код*/}
//        выражение2 -> {/*код*/}
//        else -> {/*код*/}
//    }

    println("\n")
    val score = 96
    when {
        score in 90..100 -> println("отлично")
        score in 80..89 -> println("хорошо")
        score in 70..79 -> println("уд")
        else -> println(".. подучить")
    }

    println("\nпроверки однотипные для score2")
    val score2 = 110
    when (score2) {
        in 90..100 -> println("отлично")
        in 80..89 -> println("хорошо")
        in 70..79 -> println("уд")
        else -> println(".. подучить")
    }

    println("\nПолучение значения для переменной")
    val a = 3
    val b = 4
    val max = if (a > b) {
        // код
        a // возвращаемый результат то, что в конце
    } else {
            b // возвращаемый результат то, что в конце
    }

    println("\nПолучение значения для переменной с помощью When")
    val score3 = 95
    val result = when (score3) {
        in 90..100 -> "отлично"
        in 80..89 -> "хорошо"
        in 70..79 -> "уд"
        else -> ".. подучить"
    }
    println(result)

    println("\nЗадача: определяет время суток")
    fun getTimeOfDay(hour: Int): String {
        return when {
            hour < 0 || hour > 23 -> "Неверное значение времени"
            hour in 0..4 -> "Ночь"
            hour in 5..11 -> "Утро"
            hour in 12..16 -> "День"
            else -> "Вечер"
        }
    }
    println(getTimeOfDay(5))


}



class Lesson6Summary {
}