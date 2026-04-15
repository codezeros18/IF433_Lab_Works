package oop_00000126968_lintangbalakosaardhana.week05

fun main() {

    val pegawaiList = listOf<Pegawai>(
        Dosen("Pak Budi"),
        Admin("Bu Siti")
    )

    for (pegawai in pegawaiList) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> println("${pegawai.name} tidak memiliki tugas mengajar.")
        }
    }

    val math = MathHelper()
    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 5)}")
    println("Luas Lingkaran: ${math.hitungLuas(3.0)}")

    val methods: List<PaymentMethod> = listOf(
        EWallet("Lintang", 50000.0),
        CreditCard("Lintang", 100000.0)
    )

    for (method in methods) {
        method.processPayment(75000.0)

        if (method is EWallet) {
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }
    }
}