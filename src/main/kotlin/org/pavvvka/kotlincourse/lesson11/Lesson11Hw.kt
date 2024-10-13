package org.pavvvka.kotlincourse.lesson11

fun main() {
// Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()

//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val mapFloat = mapOf(1.2F to 1.0, 1.3F to 1.0)

//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val muMap3 = mutableMapOf<Int, String>()

//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    muMap3[1] = "a"
    muMap3[2] = "b"

//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    println("Задание 5: ${muMap3[1]}; ${muMap3[10]}")  // a; null

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.
    muMap3.remove(1)

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    println("Задание 7: Перебор Словаря в Цикле")
    val dividerMap = mapOf<Double, Int>(2.0 to 1, 3.0 to 2, 4.0 to 3, 1.0 to 0)
    for ((key, value) in dividerMap) {
        if (value == 0) {
            print("бесконечность")
        } else print("${key / value} ")
    }
    println()
    // 2.0 1.5 1.3333333333333333 бесконечность

//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.
    val muMap8 = mutableMapOf(2.0 to 1, 3.0 to 2, 4.0 to 3, 1.0 to 0)
    muMap8[3.0] = 55

//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    println("Задание 9: Сложение Двух Словарей")
    val mapSource1 = mapOf(1 to "A", 2 to "B", 3 to "C")
    val mapSource2 = mapOf(4 to "D", 5 to "E", 4 to "F")
    val muMapSumm = mutableMapOf<Int, String>()
    for ((k, v) in mapSource1) {
        muMapSumm[k] = v
    }
    for ((k, v) in mapSource2) {
        muMapSumm[k] = v
    }
    println(muMapSumm)

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val hardMap = mapOf(
        "one" to listOf(1, 1),
        "two" to listOf(2, 2),
        "three" to listOf(3, 3)
    )

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    println("Задание 11: Использование Множества в Качестве Значения")
    val hMap = mapOf(
        1 to mutableSetOf("a", "b", "c"),
        2 to mutableSetOf("aa", "bb", "cc"),
        3 to mutableSetOf("aaa", "bbb", "ccc")
    )
    println("by key=${2} --> ${hMap[2]}")
    hMap[2]?.add("ФФФ")  // не упадет
    println(hMap)

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    println("Задание 12: Поиск Элемента по Значению")
    val mapPair = mapOf(
        Pair(1, 2) to "one1",
        Pair(2, 3) to "one2",
        Pair(3, 5) to "one3"
    )
    var result = "no val"
    for ((k, v) in mapPair) {
        if (k.first == 5 || k.second == 5) {
            result = v
        }
    }
    println(result)

//======
//Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.

//Задание 6: Словарь Библиотека
//Ключи - автор книги, значения - список книг
    val libraryMap = mapOf<String, List<String>>()

//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plantsMap = mapOf<String, List<String>>()

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val footballMap = mapOf<String, List<String>>()

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату
    val medicine = mapOf<String, List<String>>()

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.
    val tripMap = mapOf<String, Map<String, String>>()
}

class Lesson11Hw {
}