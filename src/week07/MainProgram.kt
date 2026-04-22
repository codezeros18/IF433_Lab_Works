package week07

fun main (){
    println("server: ${Koneksi.linkServer}")
    Koneksi.testKoneksi()

    Mahasiswa.nama = "Lintang Gaming"
    val na:Int = Mahasiswa.set_nilai(uts = 100, uas = 100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus(namaUniv = "SHENZEN UNIVERSITY")

    val dsn1 = Dosen(nama = "Lintang", nik="12345", tahunMasuk = 2050)
    println(dsn1)
    val dsn2 = dsn1.copy(nama="Wildan", nik = "67891")
    println(dsn2)
    println("Nama dosen1 : ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    println("Matkul fav saya: " + MataKuliah.OOP.name)
    println("Indekx matkul : " + MataKuliah.OOP.ordinal)
    MataKuliah.OOP.sks_matkul()

    for(matkul in MataKuliah.entries){
        println("matkul: " + matkul + "")
        matkul.sks_matkul()
    }
}