package oop_00000126968_lintangbalakosaardhana.week11

fun main() {

    val nullableName: String? = "Tony"

    nullableName?.let {
        println("Length: ${it.length}")
    }

    val result = "Kotlin".run {
        length * 2
    }

    println(result)
}