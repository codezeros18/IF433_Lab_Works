package oop_00000126968_lintangbalakosaardhana.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }

    override fun honk() {
        println("$brand berbunyi: Tiiin tiiiin!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand menambah kecepatan dengan cepat.")
    }
}