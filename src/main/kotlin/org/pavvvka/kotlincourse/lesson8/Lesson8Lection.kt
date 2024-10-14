package org.pavvvka.kotlincourse.lesson8


fun main() {
    val simpleStrin = "Это пустая срока"
    val firstName = "Иван"
    val lastName = "Иванов"
    val fullNmae = "$firstName $lastName"

    val age = 30
    val greeting = "Привет! Меня зовут $fullNmae, и мне $age лет."
    println(greeting)

    println("\n ==== создаём экземпляр объекта")
    val person = Person("Алексей", 25)
    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."
    println(introduction)

    println("\n ==== в шаблоне")
    val details = "Здесь находятся ${getDetails()}"
    println(details)

    println("\n ==== в шаблоне2")
    val x = 10
    val y = 20
    val resultString = "Результат сложения Х и У равен ${x + y}"
    println(resultString)

    ///  Методы Строки
    println("\n ==== .substring()")
    val originalString = "Kotlin is fun"
    val subString1 = originalString.substring(7)
    val subString2 = originalString.substring(3, 6) // (вкл, не вкл)
    val replacedString = originalString.replace("n", "@")
    val words = originalString.split(" ")
    val words2 = originalString.split("is ")
//                      "Kotlin is fun"
// >words               :[Kotlin, is, fun]
// >words2  " is "      :[Kotlin, fun]
// >words2  "is "       :[Kotlin , fun]

    println(">subString1      :$subString1")
    println(">subString2      :$subString2")
    println(">replacedString  :$replacedString")
    println(">words           :$words")
    println(">words2          :$words2")

    // Методы для преобразования строк (действия)
    val length = "Hello".length
    println(">length          :$length")
    val upper = "hello".uppercase()
    val lower = "HELLO".lowercase()
    println(">upper           :$upper")
    val trimmed1 = "    hellow  .".trim()                     //hellow  .// пробелы остаются
    val trimmed2 = "    hellow   ".trim()                     //hellow//
    val trimmed3 = "    hello3  .".trim('h', '.', ' ') //ello3//
    println(">trim1           :$trimmed1")
    println(">trim2           :$trimmed2")
    println(">trim3           :$trimmed3")

    // Методы проверки
    val starts = "Kotlin".startsWith("Kot")
    val ends = "Kotlin".startsWith("in")
    println(">starts          :$starts")   // :true
    println(">ends            :$ends")     // :false
    val contains = "Hello".contains("ell")
    println(">contains        :$contains") // :true
    val e: String? = null
    val empty = e.isNullOrEmpty()
    val blank = "  ".isNullOrBlank()
    println(">empty           :$empty") // :true
    println(">blank           :$blank") // :true

    // индексы с нуля
    val repeat = "ab".repeat(3)
    val letter = originalString[5]
    val indexOfChar = "Kotlin".indexOf('t') //>indexOfChar     :2
    val indexOfWord = "Kotlin best english".indexOf("best") //>indexOfWord     :7
    val backReverse = "nitlok".reversed()
    println(">repeat          :$repeat")
    println(">letter          :$letter")
    println(">indexOfChar     :$indexOfChar")
    println(">indexOfWord     :$indexOfWord")
    println(">backReverse     :$backReverse")

    val multilineString = """
           Первая строка
               Вторая строка
         Третья строка
    """.trimIndent()
    println(">multilineString :$multilineString")


    val string2 = "Sweet summer child"
    val subStr1 = string2.substring(6) // включительно
    val subStr2 = string2.substring(6, 12)  // вкл - не вкл
    println()
    println(string2)
    println(">subStr1 :$subStr1")
    println(">subStr2 :$subStr2")


    //Форматирование строк
    println("\n\n ============ Форматирование строк")
    val nick = "Алексей"
    val city = "Moscow"
    val ag = 32
    val friendsCount = 1052
    val rating = 4.948
    val balance = 234.75856
    val text = """
        Имя: %s
        Город: %s
        Возраст: %d
        Кол-во друзей: %,d
        Рейтинг: %.1f
        Баланс: $%,.2f
    """.trimIndent()

// %s строка
// %d число диджит
// %f число флоат
// %, запятая -> разбить на тысячи
// %. выведет запятую

// %,d c пробелом (разбить на тысячи)
// %.1f  [точка + 1 -> запятая] + [колво знаков после запятой]
// $%,.2f [разбить на тысячи] + [точка+2 -> запятая + колво знаков]

    println(text.format(nick, city, ag, friendsCount, rating, balance))

    println(">>> TXT: %s".format("Kotlin"))    //>>> TXT: Kotlin
    println(">>> TXT: %10s".format("Kotlin"))  //>>> TXT:     Kotlin
    println(">>> TXT: %-10s".format("Kotlin")) //>>> TXT: Kotlin

    println(">>> quantity: %10d".format(11))  //>>> quantity: 3
    println(">>> quantity: %-10d".format(11)) //>>> quantity: 3

    println(">>> PRICE: %.2f".format(3.14159))  //>>> PRICE: 3,14
    println(">>> PRICE: %6.2f".format(3.14159)) //>>> PRICE:   3,14
    println(">>> PRICE decimal: %,d".format(1000000)) //>>> PRICE decimal: 1 000 000

}

fun getDetails(): String {
    return "Очень интересные детали"
}

class Person(val name: String, val age: Int)

class Lesson8Lection {
}