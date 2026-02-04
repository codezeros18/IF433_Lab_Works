package oop_00000126968_lintangbalakosaardhana.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.8).toInt()
    else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : $note")
}