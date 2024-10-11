package org.pavvvka.kotlincourse.lesson11

fun main() {

    // Кортеж
    val pair1: Pair<Int, String> = 1 to "a"
    val pair2: Pair<List<Pair<Int, String>>, String> = listOf(Pair(1, "a"), Pair(2, "b")) to "a"
    val pair3 = Pair(2, "b")
    println("$pair1\n$pair2\n$pair3\n")
    println("${pair2.first} : ${pair2.second}")

    // СЛОВАРЬ
    val emptyMap: Map<String, String> = mapOf<String, String>()
    val capitals = mapOf(
        "RF" to "Msk",
        "FR" to "Par"
    )

    val pairs = mapOf(pair1, pair2, pair3)

    val map: Map<Int, String> = mapOf(1 to "q", 2 to "w", 3 to "e")
    // ключ уникальный - перезаписывается!

    val mutableCapitals = mutableMapOf(
        "RF" to "Msk",
        "FR" to "Par"
    )

    val capitalRussia = capitals["RF"]
    println(capitalRussia)

    mutableCapitals["GER"] = "Berlin"
    mutableCapitals.put("GER", "Berlin") // запись из Java
    mutableCapitals.remove("FR")  // удаляет и ключ и значение

    // перебор элементов в цикле
    for (entries in mutableCapitals) {
        println("> $entries -->  ${entries.key} : ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println(":::$country: $capital")
    }

    // два null ключа быть не может
    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    // ПРАКТИКА

    val myMap1: Map<String, Int> = mapOf("ass" to 22)
    val myMap = mapOf<String, Int>()
    // неизменяемый словарь, ключи числа, значения строки, проинициализировать
    val loMap = mapOf(1 to "a", 2 to "b")
    // изменяемый словарь, ключи числа, значения строки, проинициализировать
    val loMapMut = mutableMapOf(1 to "a")

    loMapMut[34] = "dsds"
    println(loMapMut[1])
    println(loMapMut[11]) // если ключа нет - вернет null

    loMapMut.remove(35) // если нет ключа - ничего не произойдет

    for (e in loMapMut) {
        print(": ${e.key} + ${e.value} ")
    }
    println()

    for ((k, v) in loMapMut) {
        print("$k:$v, ")
    }
    println()

    val newMap1 = mapOf<String, List<Int>>()
    val newMap2 = mapOf("sds" to listOf(1, 2, 3))
    val newMap3: Map<String, List<Int>> = mapOf("sds" to listOf(1, 2, 3)) // пкм на переменной - specify type

    // поиск по сложным типам ключей

}

fun searchKeyByVal(map: Map<String, String>, str: String): String {
    for (i in map) {
        if (i.key == str) {
            return i.key
        }
    }
    return "no result key"
}

class Lesson11Lecture {
}