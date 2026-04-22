package oop_00000126968_lintangbalakosaardhana.week09

data class Student(val name: String, val score: Int)

fun main() {
    val students = listOf(
        Student("A", 80),
        Student("B", 60),
        Student("C", 90)
    )

    val result = students
        .filter { it.score > 70 }
        .sortedByDescending { it.score }
        .map { "${it.name}: ${it.score}" }

    result.forEach { println(it) }
}