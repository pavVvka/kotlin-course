package org.pavvvka.kotlincourse.lesson12

fun main() {
    println(funFun(listOf(1, 2, 1)))
    println(nulFun("null"))

    printNumbersUntil(8)

    println("REFACTORING - drawRectangle1")
    drawRectangle(4, 5)
    println("REFACTORING - drawRectangle2")
    drawRectangle2(4,5)

    println("\n==== REFACTORING - printMap1")
    printMap(6, 4)
    println("\n==== REFACTORING - printMap2")
    printMap2(-15, -10)
}

// ==== Напиши валидную сигнатура метода
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun fnc() { }

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun funSum(one: Int, two: Int) = one + two

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun funStr(str: String) {}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun funFun(numbs: List<Int>): Double = numbs.sum() / numbs.size * 1.0

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun nulFun(str: String?): Int? = str?.length

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun nulNul(): Float {
    val some = nulFun("dasda")?.toFloat()
    return some ?: 10F
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun takeNul(list: List<Int>?) {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun takeInt(num: Int): String? = nulFun("sdas")?.toString()

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
val a = listOf("as", "sdd", "sss")
fun returnNullable(): List<String>? {
    if (a.size > 10) {
        return a
    }
    return listOf("asd")
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun multi(str: String?, num: Int?): Boolean? {
    if (str == null || num == null) {
        return null
    }
    return str.length == num
}

//Напиши рабочий код для следующих задач:
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(n: Int): Int = n * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(n: Int): Boolean = n % 2 == 0

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        print("$i + ")
    }
    println()
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(l: List<Int>): Int? {
    for (i in l) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(s: List<String?>) {
    for (i in s) {
        if (i == null) {
            return
        }
        print("$i - ")
    }
}

// ======== REFACTORING 1

fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}

fun drawRectangle2(width: Int, height: Int) {
    if (width <= 1 || height <= 1) throw IllegalArgumentException("width и height должны быть > единицы")
    // Верхняя граница
    println(horizontalLine(width))
    // Боковые границы
    print(column(width, height))
    // Нижняя граница
    println(horizontalLine(width))
}

fun horizontalLine(w: Int): String = "+" + "-".repeat(w - 2) + "+"

fun column(w: Int, h: Int): String = ("|" + " ".repeat(w - 2) + "|\n").repeat(h - 2)


// ======== REFACTORING 2  6*4

fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
    val formatterSize = " $xSize".length
    println(formatterSize)

    val xRange = if (xSize > 0) {
        0..xSize
    } else {
        0 downTo xSize
    }
    val yRange = if (ySize > 0) {
        0..ySize
    } else {
        0 downTo ySize
    }
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}

fun printMap2(xSize: Int, ySize: Int) {
    if (xSize == 0 || ySize == 0) throw IllegalArgumentException("Size не должно быть равным нулю")
    val formatterSize = "$xSize".length + 1 // ширина макс числа + отступ между колонками
    val xRange = if (xSize > 0) 0..xSize else 0 downTo xSize
    val yRange = if (ySize > 0) 0..ySize else 0 downTo ySize
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize + 1}s".format(i))
    }
    println()

    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val m = i * j
            print("%${formatterSize + 1}s".format(chooseSymbol(m, i)))
        }
        println()
    }
}

fun chooseSymbol(m: Int, i: Int): String {
    return when {
        m % 2 == 0 && m % 3 == 0 -> "."
        m % 2 == 0 -> "*"
        m % 5 == 0 -> if (i < 0) "-" else "+"
        else -> "?"
    }
}

class Lesson12HomeWork {
}