package org.pavvvka.kotlincourse.lesson10

fun main() {
    // Массивы  только изменяемые
    val numbers = arrayOf(1, 2, 3, 4, 5) // тип автоматически
    val numbers2: Array<Int> = arrayOf(1, 2, 3, 4, 5) // явно указываем тип
    val numbers3 = arrayOf<Int>() // пустой массив интов


    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray1 = Array(5) {""}
    val emptyArray2 = Array(5) {1}

    val emptyNullableArray1 = arrayOfNulls<Int>(5) // пустой только если налыбл
    val emptyNullableArray2: Array<Int?> = arrayOfNulls<Int>(5) // то же самое

    // Списки  могут быть изменяемые и неизменяемые
    val readOnlyList1: List<String> = listOf("a", "b", "c") // неизменяемый список
    val readOnlyList2: List<Any> = listOf(1, "b", true) // неизменяемый список

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") // изменяемый: содержание+длина

    // Множества
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5)
    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 5)

    // Методы


    println(readOnlyList1[1])

    mutableList.add("ui")
    println(mutableList[3])

    val set = setOf("K", "o", "t", "l", "i", "n")  // linked Hash Set
    println("Set перебор с for")
    for (letter in set) {
        print("| $letter |")
    }

    println("\n\nПеребор списка")
    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    println("\n\nПеребор списка в цикле While")
    val list1 = listOf(32, 53, 1, -76)
    var index = list1.lastIndex
    while (index >= 0) {
        print("`${list1[index--]}`")
    }
    println()

    // ПРАКТИКА
    println("\nСоздать пустой массив  целых чисел длинной 10 элементов")
    val arrayOfOneElement = arrayOf<Int>(10) // с одним элементом == 10 !!!
    val arrayOfZeros = Array(10) {0} // все элементы явно равны 0
    val arrayOfInts = IntArray(10) // все элементы задаются по умолчанию равны 0

    println("\nСоздатьмассив  дабл  5 элементов и инициализировать от 1 до 5")
    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    println(doubleArray)

    println("\nСоздать массив bp 10 эл и исп For с шагом 10")
    val tenArray = IntArray(10)
    var count = 10
    for(i in tenArray) {
        tenArray[i] = count
        print("${tenArray[i]}; ")
        count += 10
    }
    println()
    for (i in tenArray.indices) {
        tenArray[i] = i * 10 + 10  // (i + 1) * 10
        print("${tenArray[i]}/ ")
    }
    println()
    println(tenArray.toList())

    println("\nСоздать массив из 5 строк и заменить каждую на пустую")
    val fiveArray = arrayOf("sda", "asd", "sd ", "ffff", "jjj")
    println("${fiveArray.toList()}")

    // замена Вар.1
    for (i in 0..fiveArray.lastIndex) {
        fiveArray[i] = " * "
    }
    println(".lastIndex >>> ${fiveArray.toList()}")
    // замена Вар.2
    for (i in fiveArray.indices) {
        fiveArray[i] = " * "
    }
    println(".indices   >>> ${fiveArray.toList()}")


    println("\nСложение элементов двух массивов")
    val a1 = arrayOf(1, 2, 3)
    val a2 = arrayOf(5, 3, 37)
    val a3 = Array<Int>(3) {0}
    for(i in a1.indices) {
        a3[i] = a1[i] + a2[i]
    }
    println("Массив сумм элементов: ${a3.toList()}\n")

    // Списки
    println("\nПустой неизменяемый  Список целых чисел")
    val l1 = listOf<Int>()

    println("\nНеизменяемый         Список с тремя строк зачениями")
    val l2 = listOf<String>("adsda", "s", "ss")
    val l21 = listOf("adsda", "s", "ss")   // тип можно не указывать

    println("\nПустой изменяемый    Список  с float")
    val  l3 = mutableListOf<Float>()
    l3.add(12F)
    l3.add(55F)
    l3.remove(12F)
    println(" Mutable List - remove el:  ${l3.toList()}")
    l3.removeAt(0)
    println(" Mutable List  - remove by index:  ${l3.toList()}")

    println("\nРаспечатать в цикле")
    val l211 = listOf("adsda", "s", "ss")
    for (i in l211.indices) {
        print(">${ l211[i] }; ")
    }
    println()
    for (i in l211) {
        print(">$i; ")
    }
    println()

    // Множества
    println("\nПустой неизменяемый Множество")
    val set1 = setOf<Int>()

    val set2  = setOf(1, 2, 3, 4, 4,)

    val set3 = mutableSetOf(1, 2, 3)
    set3.add(7)
    println(set3) // .toList() писать не нужно
    set3.remove(1)
    println(set3)
    println(findNumber(set3, 4))

    println("\nПересечение Множество")
    val se1 = setOf(1, 2, 3)
    val se2 = setOf(1, 2, 3, 7 , 8)
    var seEmpty = mutableSetOf<Int>()

    for(el in se1) {
        seEmpty.add(el)
    }
    for(el in se2) {
        seEmpty.add(el)
    }
    println("seEmpty >1: $seEmpty")
    seEmpty = mutableSetOf(9)
    println("seEmpty >2: $seEmpty")
}

fun findNumber(set: Set<Int>, num: Int): Boolean {
    for(i in set) {
        if(i == num) {
            return true
        }
    }
    return false
}

class Lesson10Lecture {
}