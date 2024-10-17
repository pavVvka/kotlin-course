package org.pavvvka.kotlincourse.lesson13

val collection = listOf(1, 3, 6, 2, 4, 5, 18, 23, 28, 30, 40)
val textCollection = listOf("one", "two", null, "four", "one")

fun main() {

    // Задачи на приведение коллекций к значению

//Проверить, что размер коллекции больше 5 элементов.
    println(collection.size > 5)
//Проверить, что коллекция пустая
    println(collection.isEmpty())
//Проверить, что коллекция не пустая
    println(collection.isNotEmpty())
//Взять элемент по индексу или создать значение если индекса не существует
    println(collection.getOrElse(10) { 99 })
//Собрать коллекцию в строку
    println(collection.joinToString { "$it" })
//Посчитать сумму всех значений
    println(collection.sum())
//Посчитать среднее
    println(collection.average())
//Взять максимальное число
    println(collection.max())
//Взять минимальное число
    println(collection.min())
//Взять первое число или null
    println(collection.firstOrNull() { it % 5 > 1 })  // 3
//Проверить что коллекция содержит элемент
    println(collection.contains(5))  // true

    // Задачи на обработку коллекций listOf("one", "two", null, "four", "one")

// Отфильтровать коллекцию по диапазону 18-30
    println(collection.filter { it in 18..30 })  // [18, 23, 28, 30]
//Выбрать числа, которые не делятся на 2 и 3 одновременно
    println(collection.filterNot { it % 2 == 0 && it % 3 == 0 })
//Очистить текстовую коллекцию от null элементов
    println(textCollection.filterNot { it == null })
//Преобразовать текстовую коллекцию в коллекцию длин слов
    println(textCollection.map { it?.length }) // [3, 3, null, 4]
//Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    println(textCollection.associate { it to it?.reversed() }) // {one=eno, two=owt, null=null, four=ruof}
    println(textCollection.associateWith { it?.reversed() })
//Отсортировать список в алфавитном порядке
    println(textCollection.filterNotNull().sorted())  // [four, one, two]
    println(textCollection.filterNotNull().sortedBy { it })

    println(textCollection.sortedWith(compareBy<String?> { it == null }.thenBy { it }))
    // 1е условие возвращает false (то есть не null), будут первыми.
    // Элементы с true (то есть null) будут перемещены в конец.

//Отсортировать список по убыванию
    println(textCollection.filterNotNull().sortedDescending()) // [two, one, four]
//Распечатать квадраты элементов списка
    println(collection.map { it * it })
//Группировать список по первой букве слов
    println(textCollection.groupBy { it?.first() }) // {o=[one, om], t=[two], null=[null], f=[four]}
//Очистить список от дублей
    println(textCollection.distinct())
//Взять первые 3 элемента списка
    println(textCollection.take(3))
//Взять последние 3 элемента списка
    println(collection.takeLast(3))

    println("\n\n===> Задание 2: Характеристика числовой коллекции\n\n")
// Вызвать метод с данными, подходящими под каждую из веток

    //Если коллекция пустая - “Пусто”
    println(filterState(emptyList<Int>()))

    //Если количество элементов меньше пяти - “Короткая”
    println(filterState(listOf(2, 3, 14)))

    //Если коллекция начинается с 0 - “Стартовая”
    println(filterState(listOf(0, 2, 3, 14)))

    //Если сумма всех чисел больше 10000 - “Массивная”
    println(filterState(listOf(3000, 3000, 3000, 1001)))

    //Если среднее значение равно 10 - “Сбалансированная”
    println(filterState(listOf(10)))

    //Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    println(filterState(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))

    //Если максимальное число меньше -10 - “Отрицательная”
    println(filterState(listOf(-11)))

    //Если минимальное число больше 1000 - “Положительная”
    println(filterState(listOf(1001)))

//Если содержит одновременно числа 3 и 14 - “Пи***тая”
    println(filterState(listOf(3, 14)))

//Иначе - “Уникальная”
    println(filterState(listOf()))


}

//Задание 2: Характеристика числовой коллекции
//Написать метод, который принимает коллекцию чисел и возвращает строку
// с текущим состоянием коллекции используя конструкцию when
fun filterState(numbersCol: Collection<Int>): String {
    return when {
        numbersCol.isEmpty() -> "$numbersCol Пусто"
        numbersCol.contains(3) && numbersCol.contains(14) -> "$numbersCol Пи***тая"
        numbersCol.max() < -10 -> "$numbersCol Отрицательная"
        numbersCol.min() > 1000 -> "$numbersCol Положительная"
        numbersCol.average().toInt() == 10 -> "$numbersCol Сбалансированная"
        numbersCol.first() == 0 -> "$numbersCol Стартовая"
        numbersCol.sum() > 10000 -> "$numbersCol Массивная"
        numbersCol.size < 5 -> "$numbersCol Короткая"
        numbersCol.joinToString("").length == 20 -> "$numbersCol Клейкая"



        else -> {
            "Уникальная"
        }
    }
}