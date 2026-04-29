package Week10

class rumah (val alamat:Any)
class kampus<T>(val alamat:T)
class Komputer<T>(val merk:T, val barcode:T)
fun <T> Password(isiPass:T):T{
    return isiPass
}
class kalkulator<T:Number>(val a:T, val b:T){
    fun tambah(): Int{
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double{
        return a.toDouble() - b.toDouble();
    }
}

fun main(){
    println("=== GENERIC CONSTRAINT ===")
    val kalk = kalkulator(10.52, b = 20.347)
    println("penambahan ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah())
    println("pengurangan ${kalk.a} ditambah ${kalk.b} : " + kalk.kurang())

    println("=== GENERIC FUNCTION ===")
    println("Password kamu: " + Password(isiPass = "12345"))

    println("===GENERIC MUTLI PARAM")
    val komp = Komputer(merk ="Dell", barcode =12345)
    println("Merek komputer : ${komp.merk}")
    println("Barcode komputer : ${komp.barcode}")

    println("==== SAMPLE NON-GENERIC ===")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(rmh.alamat + 50)

    println("=== SAMPLE GENERIC ===")
    val kmps = kampus(alamat = 300)
    println(kmps.alamat + 500)
}