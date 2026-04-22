package oop_00000126968_lintangbalakosaardhana.week09

fun main() {
    val sum = { a: Int, b: Int -> a + b }
    println(sum(3, 5))

    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println(multiply(4, 6))
}