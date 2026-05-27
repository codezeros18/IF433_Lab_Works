package oop_00000126968_lintangbalakosaardhana.week14

class BadOrderProcessor {

    fun processOrder(
        customerType: String,
        price: Double
    ) {

        val finalPrice = when (customerType) {

            "VIP" -> price * 0.8

            "REGULAR" -> price * 0.9

            else -> price
        }

        println("Save order ke CSV")

        println("Send email notification")

        println("Final price: $finalPrice")
    }
}