package org.pavvvka.kotlincourse.lesson10

fun main() {

// Решай задачи в виде отдельных функций если это имеет смысл.
//Работа с массивами Array
//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val arrayFiveInt1 = arrayOf(1, 2, 3, 4, 5)
    val arrayFiveInt2 = intArrayOf(1, 2, 3, 4, 5)

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.
    val emptyArrayOf10Element = listOf<String>("", "", "", "", "", "", "", "", "", "")
    println("emptyArrayOf10Element: Size=${emptyArrayOf10Element.size} >>> $emptyArrayOf10Element\n")

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
//    var doubleArrayFilled = doubleArrayOf(0.0, 2.0, 4.0, 8.0, 16.0)
    var dblArrayFilledInLoop = DoubleArray(5)
    for (i in dblArrayFilledInLoop.indices) {
        dblArrayFilledInLoop[i] = (i * 2).toDouble()
    }
    println("doubleArrayFilledOfDoubleIndex: Size=${dblArrayFilledInLoop.size} >>> ${dblArrayFilledInLoop.toList()}\n")

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val arrayTriple = IntArray(5)
    for (i in arrayTriple.indices) {
        arrayTriple[i] = i * 3
    }
    println("arrayTriple: Size=${arrayTriple.size} >>> ${arrayTriple.toList()}\n")

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val arrayNulable = arrayOfNulls<String>(3)
    for (i in 1..arrayNulable.lastIndex) {
        arrayNulable[i] = "string $i"
    }
    println("arrayNulable: Size=${arrayNulable.size} >>> ${arrayNulable.toList()}\n")

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val arrayToCopy = Array<Int>(5) { 1 }
    println("arrayToCopy: Size=${arrayToCopy.size} >>> ${arrayToCopy.toList()}\n")
    val arrayCopy = IntArray(5)
    for (i in arrayCopy.indices) {
        arrayCopy[i] = arrayToCopy[i]
    }
    println("arrayCopy: Size=${arrayCopy.size} >>> ${arrayCopy.toList()}\n")

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val aOne = arrayOf(5, 5, 5, 5, 5, 9)
    val aTwo = arrayOf(2, 2, 2, 2, 2, 9)
    val aThree = IntArray(aOne.size)
    for (i in aOne.indices) {
        aThree[i] = aOne[i] - aTwo[i]
    }
    println("aThree: Size=${aThree.size} >>> ${aThree.toList()}\n")

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val arrayToSearch = arrayOf(1, 2, 3, 4, 5)
    println("индекс элемента со значением 5: ${find5(arrayToSearch)}")

//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    println("\nЗадание 9: Перебор Массива")
    val aBin = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in aBin.indices) {
        if (aBin[i] %2 == 0) {
            print("${aBin[i]}:Ч, ")
        } else print("${aBin[i]}:Н, ")
    }
    println()

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
    println("\nЗадание 10: Поиск Значения в Массиве по вхождению")
    println(getSubstring(arrayOf("sadak", "asd", "f"), "da"))
}

/**
 * принимает массив строк и строку для поиска.
 * Функция должна находить в массиве элемент,
 * в котором принятая строка является подстрокой (метод contains()).
 * Верни найденный элемент из функции в виде строки.
 */
fun getSubstring(arrayList: Array<String>, key: String): String {
    for(el in arrayList) {
        if (el.contains(key)) return el
    }
    return "...no such element"
}


fun find5(arrayToSearch: Array<Int>): Int {
    var i = arrayToSearch.size
    println(i)
    while (i > 0) {
        if (arrayToSearch[--i] == 5) {
            return i
        }
    }
    return -1
}

class Lesson10HomeWork {
}