package org.pavvvka.kotlincourse.lesson7

/**
 * Прямой Диапазон:
 * Напишите цикл for, который выводит числа от 1 до 5.
 * Напишите цикл for, который выводит четные числа от 1 до 10.
 */
fun main() {

    println("\n Прямой Диапазон, цикл for: выводит числа от 1 до 5.")
    for (i in 1 until 6) {
        print(if (i == 5) "$i" else "$i : ")
    }

    println("\n\n Прямой Диапазон, цикл for: выводит числа от 1 до 10.")
    for (i in IntRange(1, 10)) {
        if (i % 2 == 0) {
            print("$i : ")
        }
    }

    println("\n\n Обратный Диапазон, цикл for: выводит числа от 5 до 1")
    for (i in 5 downTo 1) {
        print("$i : ")
    }

    println("\n\n Обратный Диапазон, цикл for: выводит числа от 10 до 1, уменьшая их на 2")
    for (i in 10 downTo 1) {
        print("${i - 2} : ")
    }

    println("\n\n С Шагом (step): for с шагом 2: выводит числа от 1 до 9")
    for (i in 1 until 10 step 2) {
        print("$i : ")
    }

    println("\n\n С Шагом (step): цикл for: выводит каждое третье число в диапазоне от 1 до 20")
// 1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10 : 11 : 12 : 13 : 14 : 15 : 16 : 17 : 18 : 19 : 20 :
    println("выбор каждого третьего числа из диапазона 1..20")
    for (i in 0..20 step 3) {
        if (i != 0) {
            print("$i : ")
        }
    }
    println("для заданного 1..20 диапазона в цикле")
    for (i in 1..20 step 3) {
        print("$i : ")
    }

    println("\n\n цикл for и until: вывести числа из диапазона 1-9 (9 не включается) ")
    for (i in 1 until 9) {
        print("$i : ")
    }

    println("\n\n цикл for и until: вывести числа от 3 до 15, не включая 15")
    for (i in 3 until 15) {
        print("$i : ")
    }

    println("\n\n =========== Задания для Цикла while ==========")
    println("\n\n цикл while, который выводит квадраты чисел от 1 до 5")
    var num = 1
    while (num < 6) {
        print("${num * num++} : ")
    }

    println("\n\n цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль")
    num = 10
    while (num > 4) {
        print("${--num} : ")
    }

    println("\n\n цикл do...while, чтобы вывести числа от 5 до 1")
    num = 5
    do {
        print("$num : ")
    } while (num-- > 1)

    println("\n\n цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5")
    num = 5
    do {
        print("$num : ")
    } while (++num < 10)

    println("\n\n =========== Использование break и continue: ==========")
    println("\n\n цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6")
    for (i in 1..10) {
        if (i == 6) break
        print("$i : ")
    }

    println("\n\n цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10")
    num = 1
    while (true) {
        if (num == 10) break
        print("${num++} : ")
    }

    println("\n\n В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа")
    for (i in 1..10) {
        if (i % 2 == 0) continue
        print("$i : ")
    }

    println("\n\n цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3")
    num = 1
    while (num <= 10) {
        if (num % 3 == 0) {
            num++
            continue
        }
        print("$num : ")
        num++
    }

    println("\n\n матрица, как на картинке. Цикл в цикле: в каждом цикле использовать диапазон от 0 до 10")
    for (y in 0..10) {
        if (y == 0) continue
        var k = 0
        for (x in 0 until 10) {
            k += y
            if (k < 10) {
                print("0$k ")
            } else
                print("$k ")
        }
        println()
    }
}

class Lesson7 {
}