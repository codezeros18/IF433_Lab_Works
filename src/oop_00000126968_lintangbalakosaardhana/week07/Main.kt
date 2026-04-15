package oop_00000126968_lintangbalakosaardhana.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)
}