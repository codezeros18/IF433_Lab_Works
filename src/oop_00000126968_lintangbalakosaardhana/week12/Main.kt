package oop_00000126968_lintangbalakosaardhana.week12

fun main() {

    try {
        validateAge(15)
    } catch (e: InvalidAgeException) {
        println(e.message)
    }
}