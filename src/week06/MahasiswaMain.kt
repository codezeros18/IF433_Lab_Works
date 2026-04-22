package week06

fun main(){
    val mhs = Mahasiswa(namaOrg = "HMIF",
        budgetRapat = 18000,
        jmlOrg = 20,
        namaMK = "OOP",
        nilaiMK = 20,
        )
    mhs.rapat()
    mhs.penilaian()
    mhs.keaktifan()
}