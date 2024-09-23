package org.pavvvka.kotlincourse.lesson6

fun main() {

    println("Season is: ${getSeason(12)}")
//    println("Season is: ${getSeason(null)}")
    println("Season is: ${getSeason(-1)}")
    println("Season is: ${getSeason(13)}")
    println()

    println("The Pet`s age as human is: ${getPetAge(0.5)}")
    println("The Pet`s age as human is: ${getPetAge(1.0)}")
    println("The Pet`s age as human is: ${getPetAge(2.0)}")
    println("The Pet`s age as human is: ${getPetAge(10.0)}")
//    println("The Pet`s age is: ${getPetAge(null)}")


}

fun getPetAge(age: Double?): Double {
    val petAgeBefore3 = 10.5
    val petAgeAfter2 = 4.0

    return if ((age ?: throw Exception ("Age is empty")) < 3) {
        petAgeBefore3 * age
    } else {
        petAgeBefore3 * 2 + petAgeAfter2 * (age - 2)
    }
}



    /**
     * Определяет сезон года.
     *
     * @param monthNumber Номер месяца.
     * @return Название сезона.
     */
    fun getSeason(monthNumber: Int?): String {
        if ((monthNumber ?: throw IllegalArgumentException("Missing monthNumber")) < 1 || monthNumber > 12) {
            return "month number could be in range between 1 and 12"
        }
        return if (monthNumber > 8) {
            "Autumn"
        } else if (monthNumber > 5) {
            "Summer"
        } else if (monthNumber > 2) {
            "Spring"
        } else
            "Winter"
    }









class Lesson6 {
}