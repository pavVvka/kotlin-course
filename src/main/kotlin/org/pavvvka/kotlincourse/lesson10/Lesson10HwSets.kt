package org.pavvvka.kotlincourse.lesson10

fun main() {
    //Работа с Множествами Set
//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.
    val emptySet: Set<Int> = setOf()

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val setOf3 = setOf(1, 2, 3)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val mutSet = mutableSetOf("Kotlin", "Java", "Scala")

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    mutSet.add("Swift")
    mutSet.add("Go")
    mutSet.addAll(listOf("Swift", "Go"))
    println("Задание 4: mutSet = $mutSet")

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val setToReturn = mutableSetOf(1, 2, 3)
    setToReturn.remove(2)
    println("Задание 5: $setToReturn")

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val setOfNums = setOf(1, 2, 3)
    for (i in setOfNums) {
        print(i)
    }
    println()

//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val set7 = setOf("Kotlin", "Java", "Scala")
    println("Задание 7: ${someFilter(set7, "Jav")}")
    println("Задание 7: ${someFilter2(set7, "Java")}")

//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
    val set1 = setOf("Kotlin", "Java", "Scala", "K")
    val set2 = setOf("K", "J", "S")
    val set3 = set1 + set2
    println(set3)

//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val set11 = setOf(1, 2, 3)
    val set22 = setOf(2, 3, 4)
    val set33: MutableSet<Int> = mutableSetOf()
    for (i in set11) {
        for (k in set22) {
            if (k == i) {
                set33.add(k)
            }
        }
    }
    println("set33 = $set33")

//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго
// (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.
    val set111 = setOf("1", "2", "3")
    val set222 = setOf("2", "3", "4")
    val set333: MutableSet<String> = mutableSetOf()

    for (i in set111) {
        var isPresent = false
        for (k in set222) {
            if (i == k) {
                isPresent = true
                break
            }
        }
        if (!isPresent) {
            set333.add(i)
        }
    }
    println(set333)

//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val set1111 = setOf("1", "2", "3")
    val lst: MutableList<String> = mutableListOf()
    for (i in set1111) {
        lst.add(i)
    }
    println(lst)
}

/**
 * принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
 * Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
 *
 */
fun someFilter(set: Set<String>, str: String): Boolean {
    for (i in set) {
        if (i == str) {
            return true
        }
    }
    return false
}

fun someFilter2(set: Set<String>, str: String): Boolean = str in set

class Lesson10HwSets {
}