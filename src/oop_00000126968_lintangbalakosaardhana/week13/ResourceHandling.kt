package oop_00000126968_lintangbalakosaardhana.week13

import java.io.File

fun main() {

    val writer = File("manual.txt").printWriter()

    File("safe.txt").printWriter().use {

        it.println("Using use block safely")
    }

    File("notes.txt").bufferedReader().use { reader ->

        reader.forEachLine {
            println(it)
        }
    }

    writer.println("Manual Close Example")

    writer.close()



}