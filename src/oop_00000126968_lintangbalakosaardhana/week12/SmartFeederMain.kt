package oop_00000126968_lintangbalakosaardhana.week12

fun main() {

    var currentKibbleStock = 50

    try {

        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )

    } catch (e: FoodEmptyException) {

        println("Peringatan: ${e.message}")

    } catch (e: FeederJammedException) {

        println("Peringatan: ${e.message}")
    }
}