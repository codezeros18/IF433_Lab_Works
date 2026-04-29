package oop_00000126968_lintangbalakosaardhana.week10

class NumericalStorage<T : Number>(val value: T) {
    fun toDouble(): Double = value.toDouble()
}

fun <T> compare(a: T, b: T): Boolean
        where T : Number, T : Comparable<T> {
    return a > b
}