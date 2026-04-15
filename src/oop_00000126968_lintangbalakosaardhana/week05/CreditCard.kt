package oop_00000126968_lintangbalakosaardhana.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil menggunakan Credit Card. Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak, melebihi limit.")
        }
    }
}