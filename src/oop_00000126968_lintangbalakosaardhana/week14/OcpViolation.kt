package oop_00000126968_lintangbalakosaardhana.week14

class DiscountCalculator {

    fun calculate(type: String, price: Double): Double {

        return when (type) {

            "VIP" -> price * 0.8

            "REGULAR" -> price * 0.9

            else -> price
        }
    }
}