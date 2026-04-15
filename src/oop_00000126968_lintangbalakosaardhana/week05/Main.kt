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
}