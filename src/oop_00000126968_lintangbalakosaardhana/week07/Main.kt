package oop_00000126968_lintangbalakosaardhana.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    val user1 = User("Lintang")
    val user2 = User("Lintang")

    println(user1)
    println(user1 == user2)

    val d1 = DataUser("Lintang")
    val d2 = DataUser("Lintang")

    println(d1)
    println(d1 == d2)
}