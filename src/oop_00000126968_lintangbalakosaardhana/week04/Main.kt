package oop_00000126968_lintangbalakosaardhana.week04

fun main() {
    val vehicle = Vehicle("Toyota")
    vehicle.honk()
    vehicle.accelerate()

    val car = Car("Honda", 4)
    car.honk()
    car.accelerate()
    car.openTrunk()
}