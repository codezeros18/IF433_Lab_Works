package week07

object Koneksi {
    var linkServer:String = "http://localhost:8080"
    fun testKoneksi(){
        println("Koneksi sukses dari $linkServer")
    }
}