package oop_00000126968_lintangbalakosaardhana.week03

open class Bapake {
    private var nama:String = "Belum tau"
    private var umur:Int = 70
    protected var gaji:Int = 100000

    public var uangjajan:Int = 0
        set(value){
            if(value<0){
                println("Masa uang jajan 0")
            } else{
                field = value
            }
        }
        get(){
            return field + 123
        }

    public fun set_nama(namabaru:String){
        if(this.nama.length <= 0){
            println("Eh nama ga boleh kosong")
        } else{
            this.nama = namabaru
        }
    }

    public fun set_umur(umurbaru:Int){
        if(this.umur <= 0){
            println("Eh umur ga boleh kosong")
        } else{
            this.umur = umurbaru
        }
    }

    public fun get_nama():String{
        return this.nama;
    }

    public fun get_umur():Int{
        return this.umur;
    }

}

class Anake: Bapake(){
    fun dapatin_gaji_bapak():Int{
        this.gaji = 1000000000
        return this.gaji + 100
    }
}

fun main(){
    var bpk = Bapake()
    bpk.set_nama("Gundul")
    bpk.set_umur(100)
    println("Sumber duit kamu ${bpk.get_nama()} Umurnya ${bpk.get_umur()} ")

    var ank = Anake()
    ank.set_nama("Vassel")
    println("Gaji Pembantu : ${ank.dapatin_gaji_bapak()} ")

    ank.uangjajan = -100
}

