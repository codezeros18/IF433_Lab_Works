package week09

fun main(){
    println("==== LIST OF ====")
    var arSiswa = listOf("Budi","Danu","Susi","Cica")

    println(arSiswa)

    print("banyak siswa: " + arSiswa.size)
    println("siswa bernama ${arSiswa[1]}")

    for(a in arSiswa){
        print(a)
    }

    println("==== LIST OF MUTABLE =====")
    val arMatkul = mutableListOf("OOP","Pemweb","Matdis","Kalkulus")
    arMatkul.add("Algo")
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove(element = "Pemweb")
    println(arMatkul)

    println("==== SET OF IMUT =====")
    val arNilai = setOf(80,90,75,85,80,30,50,85)
    println("banyak nilai: ${arNilai.size}")
    println("ada angka 90 gak? ${arNilai.contains(90)}")
    println(arNilai)

    println("==== SET OF MUTABLE =====")
    val arMahasiswa = mutableSetOf("Andi","Yanto","Udin","Yuda")
    arMahasiswa.add("Yanti")
    arMahasiswa.remove(element = "Udin")
    arMahasiswa.add("Udin")
    println(arMahasiswa)

    println("==== SET OF MUTABLE =====")
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur asem" to 2500
    )
    println("banyak menu ${arResto.size}")
    println("Harga ayam : ${arResto["Ayam"]}")
    println("List makanan : ${arResto.keys}")
    println("List harga : ${arResto.values}")
    println(arResto)

    println("==== MAP MUTABLE =====")
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    )
    arKHS.remove(key = "Ara")
    arKHS["Nika"] = 92
    arKHS["Cinta"] = 99
    println(arKHS)

    println("==== LAMBDA =====")
    fun tambah(a:Int, b:Int): Int {
        return a+b
    }

    println("hasil penambahan ${tambah(5, b = 3)}")

    val kurang = {a:Int, b:Int->a-b}
    println("Hasil pengurangan ${kurang(5,3)}")

    println("==== LAMBDA {IT} =====")
    val pangkat = {a:Int -> a+a}
    val hasilPangkat:(Int)-> Int = {it + it}
    println("Hasil pangkat ${hasilPangkat(5)}")
}