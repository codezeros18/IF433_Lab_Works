package oop_00000126968_lintangbalakosaardhana.week13

import java.io.File

fun main() {

    val writer = File("manual.txt").printWriter()

    writer.println("Manual Close Example")

    writer.close()
}