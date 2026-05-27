package oop_00000126968_lintangbalakosaardhana.week13

import java.io.File

fun main() {

    File("notes.txt").writeText(
        "Hello File IO Kotlin!\n"
    )
    File("notes.txt").appendText(
        "Appending new line...\n"
    )
}