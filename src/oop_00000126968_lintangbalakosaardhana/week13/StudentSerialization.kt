package oop_00000126968_lintangbalakosaardhana.week13

data class Student(
    val id: Int,
    val name: String,
    val score: Double
)

fun Student.toCsv(): String {
    return "$id,$name,$score"
}

fun fromCsv(line: String): Student {

    val parts = line.split(",")

    return Student(
        parts[0].toInt(),
        parts[1],
        parts[2].toDouble()
    )
}