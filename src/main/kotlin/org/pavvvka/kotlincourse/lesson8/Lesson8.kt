package org.pavvvka.kotlincourse.lesson8

fun main() {
    println(phraseChecker("Это невозможно выполнить за один день"))
    println(phraseChecker("Я не уверен в успехе этого проекта"))
    println(phraseChecker("Произошла катастрофа на сервере"))
    println(phraseChecker("Этот код работает без проблем"))
    println(phraseChecker("Удача"))

    /*
    Задание 1: Извлечение Даты из Строки Лога.
    Используй indexOf или split для получения правой части сообщения.
    Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
    Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
     */
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    println("\n>>> Задание 1: Извлечение Даты из Строки Лога.\n${log}")
    println(getDataFromLog(log))

    /*
    Задание 2: Маскирование Личных Данных
    Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
    Замаскируйте все цифры, кроме последних четырех, символами "*".
     */
    val cardNumber = "4539 1488 0343 6467"
    println("\n>>> Задание 2: Маскирование Личных Данных.\n${cardNumber}")
    maskNumber(cardNumber)

    /*
    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
    Описание: У вас есть электронный адрес "username@example.com".
    Преобразуйте его в строку "username [at] example [dot] com".
     */
    val emailSample = "username@example.com"
    println("\n\n>>> Задание 3: Форматирование Адреса Электронной Почты: $emailSample")
    emailToString(emailSample)

    /*
    Задание 4: Извлечение Имени Файла из Пути
    Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt".
    Извлеките название файла с расширением.
     */
    val path = "C:/Пользователи/Документы/report.txt"
    println("\n\n>>> Задание 4: Извлечение Имени Файла из Пути: $path")
    getFileName(path)

    /*
    Задание 5: Создание Аббревиатуры из Фразы.
    - Используй split с набором символов для разделения.
    - Используй for для перебора слов.
    - Используй var переменную для накопления первых букв.
    Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
    Создайте аббревиатуру из начальных букв слов (например, "ООП").
     */
    val phrase = "Объектно-ориентированное программирование"
    println("\n\n>>> Задание 5: Создание Аббревиатуры из Фразы: $phrase")
    abbreviatePhrase(phrase)

    /*  --- 6 ---
    Написать метод, который преобразует строку из нескольких слов в строку,
    где каждое слово начинается с заглавной буквы а все остальные - строчные.
    (можно использовать такой же подход как в задании 5,
    но накапливать не первые буквы а целиком слова,
    составленные из первой буквы с uppercase и оставшейся части слова)
     */
    val text = "ОбъектНо-ориентирОванное, программирование"
    println("\n\n>>> Задание ---6---: строку из нескольких слов в строку: $text")
    printWordsFromPhrase(phrase)

    /* --- 7 ---
    Написать шифратор/дешифратор для строки.
    Шифровка производится путём замены двух соседних букв между собой:
    Kotlin шифруется в oKltni.
    Дешифровка выполняется аналогично.
    Если длина строки - нечётная,
    в конец добавляется символ пробела до начала шифрования.
    Таким образом все шифрованные сообщения будут с чётной длинной.
    Должно получиться два публичных метода:
    encrypt() и decrypt() которые принимают и возвращают строку.
     */
    val txt = "ОбъектНо-"
    println("\n\n>>> Задание ---7---: шифратор/дешифратор для строки: $txt")
    println(encrypt(txt))
    val sample = encrypt(txt)
    decrypt(sample)

    /* --- 8 ---
    Вывести таблицу умножения в консоль так, чтобы были ровные строки и столбцы.
    В заголовках столбцов и строк - числа для перемножения.
    В перекрестии - результат умножения.
    Каждый столбец должен быть выровнен по правому краю.
    Для выравнивания использовать функции форматирования строк с шаблоном (%s)
     */
    println("\n\n>>> Задание ---8---: Вывести таблицу умножения")
    val size = 5
    matrix(size)
    multiplyTable(5, 5)
}

fun multiplyTable(first: Int, second: Int) {
    val formatLength = (first * second).toString().length + 1
    print(" ".repeat(formatLength))

    val xRange = getRange(first)
    val yRange = getRange(second)
    val formatter = "%${formatLength}s"
    for (i in xRange) {
        print(formatter.format("$i"))
    }
    println()
    for (i in yRange) {
        print(formatter.format("$i"))
        for (j in xRange) {
            print(formatter.format("${i * j}"))
        }
        println()
    }
}

private fun getRange(size: Int): IntProgression {
    return when {
        size > 0 -> 1..size
        size < 0 -> -1 downTo size
        else -> throw IllegalArgumentException("Неверное значение size")

    }
}



fun matrix(size: Int) {
    val indent = "${size * size}".length // ширина поля = кол. знаков у максимального числа
//    val indent = (size * size).toString().length // ширина поля = кол. знаков у максимального числа
    val columnWidth = indent + 1 // поле плюс отступ

    // строка - заголовок
    var firstString = " ".repeat(indent) // первый отступ
    for (i in 1..size) {
        firstString += "%${columnWidth}d".format(i)
    }
    println(firstString)

    // строки: заголовок + результат
    for (y in 1..size) {
        print("%${indent}d".format(y)) // номер строки без отступа
        for (x in 1..size) {
            print("%${columnWidth}d".format(x * y))
        }
        println()
    }
}

/**
 * Печатает строку: Меняет местами каждые два символа заданной строки.
 */
fun decrypt(txt: String) {
    var result = ""
    for (i in 2..txt.length step 2) {
        result += txt.substring(i - 2, i).reversed()
//        result += txt.substring(i - 1, i) + txt.substring(i - 2, i -1) // вариант
    }
    println(">>${result.trim()}")
}

/**
 * Добавляет пробел к строке, если нечетное кол. символов.
 * Меняет местами каждые два символа заданной строки.
 *
 * @return получившуюся строку
 */
fun encrypt(txt: String): String {
    var string = txt
    if (txt.length % 2 != 0) {
        string += " "
    }
    println(string)

    var resultString = ""
    var index = 0
    while (string.length != resultString.length) {
        resultString += string.substring(index, index + 2).reversed()
        index += 2
    }
    println(resultString)
    return resultString
}

/**
 * Делит строку на подстроки по заданным символам.
 * Выводит строку из подстрок, делая первую букву каждой заглавной,
 * а оставшуюся часть подстроки - маленькими.
 */
fun printWordsFromPhrase(text: String) {
    val splittedPhrase = text.split("-", " ", ",")
    var result = ""
    for (i in splittedPhrase) {
        result += "${i.first().uppercase()}${i.substring(1).lowercase()} "
    }
    println(result)
}

/**
 * Печатает первый символ элемента строки в верхнем регистре.
 */
fun abbreviatePhrase(phrase: String) {
    val splittedPhrase = phrase.split("-", " ")
    var result = ""
    for (i in splittedPhrase) {
//        print(i.first().uppercase())            // вариант 1
//        result += i.first().uppercase()         // вариант 2
        result += i.substring(0, 1).uppercase()   // вариант 3
    }
    println(result)
}

/**
 * извлекает из строки строку после последнего вхождения "/"
 */
fun getFileName(text: String) {
    println("Вариант 1")
    println(text.split("/").last())

    println("Вариант 2")
    println(text.substring(text.lastIndexOf("/") + 1))

}

/**
 * Меняет "@" "." в строке на " \[at] " " \[dot] "
 */
fun emailToString(email: String) {
    println("Вариант 1")
    val eName = email.substring(0, email.indexOf('@'))
    val eDomen = email.substring(email.indexOf('@'), email.indexOf('.')).trim('@')
    val eTopDomen = email.substring(email.indexOf('.')).trim('.')
    println("$eName [at] $eDomen [dot] $eTopDomen")

    println("Вариант 2")
    val em = email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(em)
}

/**
 * печатает строку звезд и последний элемент аргумент-массива, разбитого по пробеллам
 */
fun maskNumber(number: String) {
//    val stars = "**** "
//    for (i in 0..2) {
//        print(stars)
//    }
    repeat(3) { print("**** ") }
    println(number.split(" ")[3])
}

/**
 * Распечатывает дату и время по очереди из Строки Лога.
 *     Использует indexOf или split для получения правой части сообщения.
 */
fun getDataFromLog(log: String): String {
    // вариант1
//    return log.substring(32).substring(0, 11) +
//            "\n" +
//            log.substring(32).substring(11)

    // вариант2
    val data = log.substring(log.indexOf("> ") + 2)
    return data.split(" ")[0] + "\n" + data.split(" ")[1]
}

/**
 * анализирует входящие фразы и применяет к ним различные преобразования
 *
 * - "невозможно": "невозможно" на "совершенно точно возможно, просто требует времени"
 * - "Я не уверен":  Добавьте в конец фразы ", но моя интуиция говорит об обратном".
 * - "катастрофа": Замените "катастрофа" на "интересное событие".
 * - "без проблем": Замените "без проблем" на "с парой интересных вызовов на пути".
 * - только одно слово: Добавьте перед словом "Иногда," и после слова ", но не всегда".
 */
fun phraseChecker(phrase: String): String {
    return when {
        phrase.contains("невозможно") -> phrase.replace(
            "невозможно",
            "совершенно точно возможно, просто требует времени"
        )

        phrase.contains("Я не уверен") -> "$phrase, но моя интуиция говорит об обратном"
        phrase.contains("катастрофа") ->
            phrase.replace("катастрофа", "интересное событие").replace("шла", "шло")

        phrase.contains("без проблем") -> phrase.replace("без проблем", "с парой интересных вызовов на пути")
        !phrase.contains(" ") -> "Иногда ${phrase.lowercase()}, но не всегда"
        else -> phrase
    }
}

class Lesson8 {
}