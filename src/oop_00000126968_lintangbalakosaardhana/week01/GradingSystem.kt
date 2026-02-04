package oop_00000126968_lintangbalakosaardhana.week01

fun main() {
    val name = "Lintang Balakosa Ardhana"
    val score = 90

    println("Name: $name , Nilai: $score")

    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"


