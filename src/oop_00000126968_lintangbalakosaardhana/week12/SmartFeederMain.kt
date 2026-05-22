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

    } finally {

        println("(LOG) Jadwal makan selesai diproses")
    }

    runCatching {

        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )

    }.onSuccess { newStock ->

        currentKibbleStock = newStock

        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")

    }.onFailure { error ->

        println("Peringatan ke Pemilik: ${error.message}")

        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}