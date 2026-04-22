package week08

class set_krs(val nim:String, val kodematkul:String?){
    fun matkul_wajib(sks: Int?){
        println("matkul kamu adalah $kodematkul sks-nya adalah $sks")
    }
}

fun main(){
    var nama:String? = "Lintang Gacor"
    nama = null
    println("hai $nama")

    val settingKRS = set_krs(nim = "123", kodematkul="null")
    println("nim kamu ${settingKRS.nim}, matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)
}

