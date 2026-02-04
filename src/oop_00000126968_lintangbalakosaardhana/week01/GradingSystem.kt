package oop_00000126968_lintangbalakosaardhana.week01

fun main() {
    val name = "Lintang Balakosa Ardhana"
    val score = 90

    println("Name: $name , Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..100 -> "B"
        in 70..100 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}



