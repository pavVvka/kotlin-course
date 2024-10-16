package org.pavvvka.kotlincourse.lesson13

fun main() {

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = flitttter(list)
    println("filtered1 $filtered1")

    // Что такое it
    // Метод filter() должен возвращать Булиан
    val filtered2 = list.filter { it in 7..17 } // лямбда, it название переменной
    // it = это то же: name -> name in 7..17
    println("filtered2 $filtered2")

    val filtered3 = list.filter {   // Boolean
        val result = it in 7..17
        result
    }

    // Пример
    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println("positiveNumbers $positiveNumbers")

    // Фильтр NOT
    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println("notPositiveNumbers $notPositiveNumbers")

    // Фильтр NotNull
    val nullableList: List<Int?> = listOf(1, null, 2, null, 3)
    val nonNullList: List<Int> = nullableList.filterNotNull()
    println("nonNullList $nonNullList")

    // 1). отфильтр по условию 2). Вернет 1-е значение. или Вернет null
    val firstPositive = numbers.firstOrNull { it > 0 }
    println("firstPositive $firstPositive") // 2

    // ПОЛУЧЕНИЕ ЭЛЕМЕНТОВ

    // numbers[10] не получим искл, если невалидный индекс : вернет заданное значение
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse)

    // ПРЕОБРАЗОВАНИЕ

    // в словарь
    val incrementedNumbers: List<String> = numbers.map { "$it%" }
//    val incrementedNumbers: List<Int> = numbers.map { it + 1 }
    println("incrementedNumbers $incrementedNumbers")

    // преобразует коллекцию в словарь
    val numberSquareMap = numbers.associate { it to it * it }
    println("numberSquareMap $numberSquareMap")
    // associateWith -> значение=аргумент
    val numberSquareMapWith = numbers.associateWith { "$it%" }
    println("numberSquareMapWith $numberSquareMapWith")
    // associateBy -> ключ=аргумент
    val numberSquareMapBy = numbers.associateBy { "$it%" }
    println("numberSquareMapBy $numberSquareMapBy")

    println("--------------------------------------------")
    // Вложенный список
    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    println("multipleList $multipleList")

    //
    val flattenList = multipleList.flatten()
    println("flattenList $flattenList")

    // .flatMap - полученные и преобразованные списки склеивает в один список
    // c помощью временной переменной temp -> listOf(1, 2, 3)
    val flattenListAfterMapping = multipleList.flatMap { temp ->
        temp.map { it * 2 }
    }
    val flattenListAfterMapping1 = multipleList.flatMap {
        it.map { it * 2 }  // типа не наглядно
    }
    println("flattenListAfterMapping $flattenListAfterMapping")

    // Сборка в строку
    val numbersString1 = numbers.joinToString(separator = ", ")
    println("numbersString1 $numbersString1")
    val numbersString2 = numbers.joinToString(separator = " || ") {
        "$it * $it"
    }
    println("numbersString2: $numbersString2")

    // СОРТИРОВКА любые типы

    val sortedNumbers = numbers.sorted()
    println("sortedNumbers: $sortedNumbers")

    val sortedNumbersDesc = numbers.sortedDescending()
    println("sortedNumbersDesc: $sortedNumbersDesc")

    // способ перебора
    (1..4).forEach { println(it) }


    val sumOfNums = numbers.sum()

    val average: Double = numbers.average()

    val maxNumber = numbers.maxOrNull() // просто макс офигеет если список будет пуст

    // создает мапу с двумя ключами  и раскладывает элементы списка в соотв с условиями
    val groupBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }

    val distinctNumbers = listOf(1, 2, 2, 2, 3, 3).distinct() // возвращает новый список

    // создают новый список
    println(numbers.take(3)) // первые три элемента списка - без исключений по длине спииска
    println(numbers.takeLast(3))
    println(numbers.size)

    // ПРАКТИКА

    val newCol: List<Int> = listOf(1, 3, 5, 7)
    val moreEl = newCol.last()
    if (newCol.size < 0) println("OK")

    numbers.isEmpty()
    numbers.isNotEmpty()

    val defaultValue = -1
    println(numbers.getOrElse(10) {-1})
    println(numbers.getOrElse(10) {it})

    val ages = listOf(17, 18, 28, 11, 69)
    println(ages.filter { it in 18..30 })
}

fun flitttter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}

class Lesson13Lecture {
}