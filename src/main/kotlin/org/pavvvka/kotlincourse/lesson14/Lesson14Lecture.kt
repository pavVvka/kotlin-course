package org.pavvvka.kotlincourse.lesson14

fun main() {

    val fruitsPrices = mapOf(
        "apple" to 2.99,
        "banana" to 1.99,
        "cherry" to 3.99
    )

    // перебор через entries
    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }
    // Когда вы пишете for (entry in map), компилятор автоматически обращается к коллекции
    // записей (entries) внутри Map, поэтому явное указание .entries не обязательно.

    // перебор - другая запись
    for ((fruit, price) in fruitsPrices) {
        println("Key: $fruit, Value: $price")
    }

    // МЕТОДЫ ПЕРЕБОРА
//    val entries = fruitPrices.entries
    val entries: Set<Map.Entry<String, Double>> = fruitsPrices.entries
//    val keys = fruitPrices.keys
    val keys: Set<String> = fruitsPrices.keys
//    val values = fruitPrices.values
    val values: Collection<Double> = fruitsPrices.values


    // ПОЛУЧЕНИЕ
    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") {
//        throw IllegalArgumentException()
    }
    val priceOfApple = fruitsPrices.getValue("apple")   // fruitsPrices["pear"]!!
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

    // ИЗМЕНЕНИЯ - все методы создают новый словарь
    val fruitsWithoutBanana = fruitsPrices - "banana" // удаляет этого ключа\значения
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // новый словарь с этой парой
    val mutableFruits = fruitsPrices.toMutableMap()

    // для изменяемого словаря:
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))  // добавить все элементы другого словаря
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear()

    // ПРОВЕРКИ - возвращают true|false
    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive: Boolean = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }

    // ФИЛЬТРЫ - возвращают новый словарь
    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    // ПРЕОБРАЗОВАНИЕ
    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList: List<String> = fruitsPrices.map { "${it.key} costs ${it.value}" } // в список
    val fruitsListOfPairs: List<Pair<String, Double>> = fruitsPrices.map { it.key to it.value } // в список пар

    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()

    // деструктуризация явная
    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    // деструктуризация не явная
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }

    classWork()

}


// практика

fun classWork() {

    val myMap = mapOf<String, Int>()
    for (entry in myMap.entries) {
        println("> Key: ${entry.key}, > Value: ${entry.value}")
    }
    println(myMap.values)
    println(myMap.keys)

    // название=кол-во
    val mapProductCount = mapOf<String, Int>()
    val cherry = "cherry"
    println(mapProductCount.getOrElse(cherry) {
        println("$cherry NOT FOUND")
        //    println(mapProductCount.getOrElse("cherry") {throw Exception("not found")})
    })
    println(":")
    println(mapProductCount.containsKey("bon"))
    println(mapProductCount.containsValue(10))

    // Преобразование в строку. создать список название=цена
    val copyMap = mapOf(
        "apple" to 2.99,
        "banana" to 1.99,
        "cherry" to 3.99
    )
    println(copyMap)
    print(copyMap.map {
        "Продукт ${it.key} стоит ${it.value}"
    })
    println(" !")

    println("Кол-во  меньше 10 ")
    println(copyMap.values.map { 10 }) // заменяет каждый элемент на 10, независимо от его исходного значения

    println("\"Все ли меньше 10 ? __  ${ copyMap.all { it.value < 10 } }")
    println("\"Есть ли кто-то больше 10 ? __  ${ copyMap.any() { it.value > 10 } }")

    println(copyMap.filterValues { it > 2 })

    val copyMapMut = copyMap.toMutableMap()

    println(copyMapMut["apple"])  // печать значения
    println(copyMapMut)
    copyMapMut.remove("apple")  // удалим по ключу
    println(copyMapMut)
    copyMapMut.putAll(copyMap) // Сольем два словаря
    println(copyMapMut)
    copyMapMut.clear()
}