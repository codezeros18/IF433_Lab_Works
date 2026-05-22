package oop_00000126968_lintangbalakosaardhana.week11

class User {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    val user = User().apply {
        name = "Lintang"
        age = 20
    }

    println(user.name)
    println(user.age)
}