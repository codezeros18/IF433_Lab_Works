package oop_00000126968_lintangbalakosaardhana.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)

    val squared = numbers.map { it * it }
    println(squared)

    val sortedDesc = numbers.sortedByDescending { it }
    sortedDesc.forEach { println(it) }
}