package org.pavvvka.kotlincourse.lesson7

var counter = 5
fun main() {

//    // синтаксис цикла
//    for (item in collection) { }
//    for (i in collection) { }
//    for (item in listOf(1, 2, 3, 4)) { }
//    for (item in 1..2) { }
//    for (item in 1 until 2) { }
//    for (item in 10 downTo 2) { }


    println("downTo")
    for (i in 10 downTo 1 step 3) {
        println(i)
    }
    println("until")
    for (i in 10 until 20 step 3) {
        println(i)
    }

//    while(true) { } // бесконечный цикл
    println("postdecrement")
    counter = 5
    while (counter-- > 0) {
        println(counter)
    }
    println("classic")
    counter = 5
    while (counter > 0) {
        println(counter)
        counter -= 1
    }

    println("decrement work")
    counter = 5
    while (getResult()) {
        println(counter)
    }


    println("do while - позволяет сократить код")
    do {
        println("+")
    } while (false)

    println("continue; break ")
    for (i in 1..20) {
        if (i == 2) continue
        if (i == 7) break
    }

    println("\nprint in line ")
    for (i in 1..10) {
        print(i)
    }

    println("\n квадраты чисел от 1 до 5 ")
    for (i in 1..5) {
        println(i * i)
    }
    println("\n обратный порядок ")
    for (i in 10 downTo 1) {
        print("$i, ")
    }
    println("\n только четные ")
    for (i in 10 downTo 1) {
        if (i % 2 == 0) {
            print(i)
        } else print("-")
    }
    println("\n суммирует от 1 до 10 ")
    var ind = 1
    var res = 0
    while (ind <= 10) {
        res += ind++
//        res = ind++ + res
        print("$res - ")
    }

    println("\n считает кол цифр в числе  (длина от 100 до 1)")
    counter = 1
    while (counter < 101) {
        val result = counter++.toString().length
        print(result)
    }
}

fun getResult(): Boolean {
    return counter-- > 0
}


