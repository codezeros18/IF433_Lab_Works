package oop_00000126968_lintangbalakosaardhana.week05

class Admin(
    name: String
) : Pegawai(name) {

    override fun bekerja() {
        println("$name sedang mengurus administrasi.")
    }
}