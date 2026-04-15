package oop_00000126968_lintangbalakosaardhana.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    val user1 = User("Lintang")
    val user2 = User("Lintang")

    println(user1)
    println(user1 == user2)
}