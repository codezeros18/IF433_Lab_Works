package oop_00000126968_lintangbalakosaardhana.week03

class Employee(val name:String) {
    var salary: Int = 0
        set(value){
            if(value < 0){
                println("ERROR: Gaji tidak boleh negatif! Diset ke 0")
                field = 0
            } else
                field = value
        }
}
