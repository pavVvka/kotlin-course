package org.pavvvka.kotlincourse.lesson10

fun main() {

    //Работа со списками List
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.
    val emptyIntList: List<Int>
    val emptyIntList2 = emptyList<Int>()

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val listEl = listOf("Hello", "World", "Kotlin")

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
    mutableList.addAll(listOf(6, 7, 8))
    println("ml> $mutableList")

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val mutStrList = mutableListOf("Hello", "World", "Kotlin")
    mutStrList.remove("World")
    mutStrList.remove("Hell")
    println(mutStrList)

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val listToPrint = listOf(1, 2, 3)
    for (i in listToPrint) {
        print(i)
    }
    println()

//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.
    val strList = arrayOf("asa", "ddd", "f")
    println("Задание 7: ${strList[1]}")

//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val mutIntList = mutableListOf(1, 2, 3, 4)
    mutIntList[1] = 99
    println(mutIntList)

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val listOne = listOf("one", "two")
    val listTwo = listOf("three", "four")
    val newList = mutableListOf<String>()
    for(i in listOne.indices) {
        newList.add(listOne[i])
    }
    for (i in listTwo.indices) {
        newList.add(listTwo[i])
    }
    println("Задание 9: Объединение Двух Списков:   $newList")


//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    println()
    val listMaxMin = listOf(3, 2, 3, 8, 1, 5, 6, 7)
    var max = listMaxMin[0]
    var min = listMaxMin[0]
    for (i in listMaxMin) {
        if(i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    println("$listMaxMin\nmin = $min\nmax = $max")

//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val someList = listOf(1, 2, 3, 4, 5, 6, 7)
    val evenList = mutableListOf<Int>()
    val evenList2: MutableList<Int>
    for(i in someList) {
        if (i % 2 == 0) {
            evenList.add(i)
        }
    }

    println("someList $someList\nevenList $evenList")
}


class Lesson10HwList {
}