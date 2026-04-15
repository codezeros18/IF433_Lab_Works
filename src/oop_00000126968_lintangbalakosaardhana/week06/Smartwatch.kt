package oop_00000126968_lintangbalakosaardhana.week06

class Smartwatch(
    brand: String
) : Watch(brand), Playable, Trackable {

    override fun showTime() {
        println("$brand menampilkan waktu digital.")
    }

    override fun playMusic() {
        println("$brand memutar musik.")
    }

    override fun trackSteps() {
        println("$brand menghitung langkah.")
    }
}