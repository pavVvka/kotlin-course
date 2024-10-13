package org.pavvvka.kotlincourse.lesson12

fun main() {


}

fun sum(first: Double, sec: Double, flag: Boolean): Double {
    return if (flag) {
        first + sec
    } else {
        first - sec
    }
}

//
fun getMax(f: Int, s: Int) = if (f < s) s else f


class Lesson12Lecture {
}