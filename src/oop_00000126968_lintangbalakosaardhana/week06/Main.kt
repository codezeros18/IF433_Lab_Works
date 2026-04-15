package oop_00000126968_lintangbalakosaardhana.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    method.pay(amount)
}

fun main() {
    processCheckout(Gopay(), 50000.0)
    processCheckout(CreditCard(), 75000.0)
}