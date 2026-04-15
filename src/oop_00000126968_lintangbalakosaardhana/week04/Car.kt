package oop_00000126968_lintangbalakosaardhana.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }
}