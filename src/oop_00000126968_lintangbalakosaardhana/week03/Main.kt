package oop_00000126968_lintangbalakosaardhana.week03

fun main(){

    // ====== Employee Test ======
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji : ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar : ${e.tax}")


    // ====== Weapon Test ======
    val w = Weapon("Excalibur")

    w.damage = -50
    println("Damage: ${w.damage}")

    w.damage = 9999
    println("Damage: ${w.damage}")

    println("Tier: ${w.tier}")


    // ====== Player Test ======
    val p = Player("Lintang")

    p.addXp(50)
    p.addXp(60)
}
