package oop_00000126968_lintangbalakosaardhana.week04

open class Vehicle(
    val brand: String
) {

    fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}