package org.pavvvka.kotlincourse.lesson14

val testMap = mapOf<String, Long>()
val metaMap = mapOf<String, String>("m1" to "d1", "m2" to "d2")
val mutMap = metaMap.toMutableMap()

fun main() {
//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
    testMap.values.average()

//
//Имеется словарь с метаданными автоматизированных тестов,
// где ключи — это имена тестовых методов а значения - строка с метаданными.
// Выведите список всех тестовых методов.
    println(metaMap.map { it.key })
    println(metaMap.keys)

//
//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    mutMap["m3"] = "d3"  // напрямую
    mutMap.put("m4", "d4")
    val mutMapNew = mutMap + ("m4" to "d4") // новый словарь

//
//Посчитайте количество успешных тестов в словаре с результатами.
    mutMap.values.count { it == "passed" }

//
//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    mutMap.remove("bug-101")
    val mutMapNew1 = mutMap - "bug-101"  // новый словарь

//
//Для словаря с результатами тестирования веб-страниц
// (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
    println("'")
    println(mutMap["fff.com"])
    mutMap.forEach { println(">>> ${it.key} status ${it.value}") }
    println()

//
//Найдите в словаре с названием и временем ответа сервисов только те,
// время ответа которых превышает заданный порог.
    testMap.filter { it.value > 100 }

//
//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
// Для указанного endpoint найдите статус ответа,
// если endpoint отсутствует, предположите, что он не был протестирован.
    metaMap.getOrDefault("end", "passed")

//
//Из словаря, содержащего конфигурации тестового окружения
// (ключ — название параметра конфигурации), получите значение для "browserType".
// Ответ не может быть null.
    metaMap["browserType"] ?: "Tor"

//
//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО,
// чтобы добавить новую версию.
    val mutMut = metaMap.toMutableMap()
    mutMut["app"] = "2.2.2"
    val mutMut1 = metaMap + ("app2" to "3.3.3") // в одну строку

//
//Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства), получите настройки для конкретной модели
// или верните настройки по умолчанию.
    metaMap.getOrElse("asus") { "default" }

//
//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val mapTest = mapOf<Int, String>()
    mapTest.keys.contains(200)

//
//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии,
// идентификаторы которых соответствуют определённой версии тестов.
    metaMap.filter { it.key.contains("123") }
    metaMap.filterKeys { it.contains("123") }

//
//У вас есть словарь, где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
    metaMap.values.any { it == "failed" }

//
//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    mutMut.putAll(mutMap)

//
//Объедините два неизменяемых словаря с данными о багах.
    val bugsMap1 = mapOf("BUG-101" to "Open", "BUG-102" to "In Progress")
    val bugsMap2 = mapOf("BUG-102" to "Resolved", "BUG-103" to "Closed")
    val sumMap = bugsMap1 + bugsMap2
    println(sumMap)

//
//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    println("\nmutMut1: $mutMut1")
    val mutMut2 = mutMut1.toMutableMap()
    println("mutMut2: $mutMut2")
    mutMut2.clear()
    println("clear mutMut2: $mutMut2\n")

//
//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    println("metaMap: $metaMap")
    val metaMap1 = metaMap.values.filterNot { it == "skipped" }
    println("metaMap1 skipped: $metaMap1")

    val metaMap2 = metaMap.values.filterNot { it == "skipped" }
    println("metaMap2 skipped: $metaMap2\n")

//
//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    mutMut2.remove("kkk")

//
//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResults = mapOf(
        "TST-101" to "Passed",
        "TST-102" to "Failed",
        "TST-103" to "Skipped"
    )

    val report = testResults.map { (testId, result) -> "Test ID: $testId — Result: $result" }
    report.forEach { println(it) }

//
//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val mmm = mutMap.toMap()

//
//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
    val testTimes = mapOf(
        "TST-101" to "120ms",
        "TST-102" to "250ms",
        "TST-103" to "300ms"
    )


    fun getNameById(id: String): String {
        return when (id) {
            "TST-101" -> "Login Test"
            "TST-102" -> "Checkout Test"
            "TST-103" -> "Payment Test"
            else -> "Unknown Test"
        }
    }

    val tttnnn = testTimes.mapKeys { getNameById(it.key) }
    println("\ntttnnn $tttnnn\n")
    // tttnnn {Login Test=120ms, Checkout Test=250ms, Payment Test=300ms}

//
//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    testMap.mapValues { it.value * 1.1 }

//
//Проверьте, пуст ли словарь с ошибками компиляции тестов.
    metaMap.isEmpty()

//
//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    metaMap.isNotEmpty()

//
//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    testResults.all { it.value == "Passed" }

//
//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    testResults.any { it.value == "failed" }

//
//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    println("\n $testResults")
    val res = testResults.filter { it.value == "failed" && it.key.contains("optional") }
    println("\n $res")
}

class L14HomeWork {
}