package oop_00000126968_lintangbalakosaardhana.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Membayar $amount menggunakan GoPay")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Membayar $amount menggunakan Credit Card")
    }
}