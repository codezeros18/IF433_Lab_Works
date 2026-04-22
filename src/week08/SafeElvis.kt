package week08

class Alamat(val nomor:Int, val kota: String)
class Mahasiswa(val nim:String, val addr:Alamat?)

fun main(){
    val almt = Alamat(nomor = 47, kota = "Tangerang")
    val mhs = Mahasiswa(nim = "12345", addr = null)

    val defaultAlamat = mhs.addr?.let {
        alamatAsli -> "sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}"
    }?:"Gak jelas, ga tau dimana"

    println("Nimnya ${mhs.nim} tinggalnya di ${defaultAlamat}")
}