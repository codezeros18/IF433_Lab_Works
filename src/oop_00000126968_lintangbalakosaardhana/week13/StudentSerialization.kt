package oop_00000126968_lintangbalakosaardhana.week13

import java.io.File
import java.io.FileNotFoundException

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

fun saveStudents(
    students: List<Student>,
    path: String
) {

    File(path).printWriter().use { writer ->

        students.forEach {
            writer.println(it.toCsv())
        }
    }
}

fun loadStudents(path: String): List<Student> {

    return try {

        File(path)
            .readLines()
            .map { fromCsv(it) }

    } catch (e: FileNotFoundException) {

        emptyList()
    }
}

fun main() {

    val students = listOf(
        Student(1, "Tony", 90.5),
        Student(2, "Steve", 88.0)
    )

    saveStudents(
        students,
        "students.csv"
    )

    val loaded = loadStudents("students.csv")

    loaded.forEach {
        println(it)
    }
}