package oop_00000126968_lintangbalakosaardhana.week09

fun main() {
    // Immutable List
    val immutableList = listOf("A", "B", "C")
    println("Immutable List: $immutableList")

    // Mutable List
    val mutableList = mutableListOf("A", "B", "C")
    mutableList.add("D")
    println("Mutable List: $mutableList")

    // Set (hapus duplikat)
    val setData = setOf(1, 2, 2, 3, 3, 4)
    println("Set (unique): $setData")
}