package oop_00000126968_lintangbalakosaardhana.week12

fun main() {

    try {
        val number = 10 / 0
        println(number)
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    }
}