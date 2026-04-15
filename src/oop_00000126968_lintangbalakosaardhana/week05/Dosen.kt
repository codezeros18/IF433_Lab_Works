package oop_00000126968_lintangbalakosaardhana.week05

class Dosen(
    name: String
) : Pegawai(name) {

    override fun bekerja() {
        println("$name sedang mengajar di kelas.")
    }

    fun mengajar() {
        println("$name sedang menjelaskan materi.")
    }
}