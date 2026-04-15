package oop_00000126968_lintangbalakosaardhana.week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}