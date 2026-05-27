package oop_00000126968_lintangbalakosaardhana.week14

class BadUserManager {

    fun registerUser(name: String) {

        if (name.isBlank()) {
            println("Nama tidak valid")
            return
        }

        println("Save user ke database")

        println("Kirim email ke user")
    }
}

fun main() {

    val manager = BadUserManager()

    manager.registerUser("Tony")
}