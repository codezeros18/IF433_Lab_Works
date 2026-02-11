package week02

class Pemain {
    var nama:String = "Tidak terdaftar"
    var speed:Int = 9
    val shoot:Int = 8

    init {
        nama = "Lintang"
        println("Ini adalah constructor")
    }

    constructor(alias:String="Dana", kecepatan:Int=2){
        nama = alias
        speed = kecepatan
        println("Ini adalah constructor kedua")
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola")
    }
}

fun main(){
    val player = Pemain(alias = "Balakosa", kecepatan = 200)
    player.bawa_bola()
    println("nama pemain : ${player.nama}")
    println("skill kecepatan: " + player.speed)

    val player2 = Pemain(alias = "Wildan", kecepatan = 50)
    player2.bawa_bola()
    println("nama pemain : ${player.nama}")
    println("skill kecepatan: " + player.speed)
}

