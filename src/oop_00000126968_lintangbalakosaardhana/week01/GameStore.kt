package oop_00000126968_lintangbalakosaardhana.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.8).toInt()
    else (price * 0.9).toInt()