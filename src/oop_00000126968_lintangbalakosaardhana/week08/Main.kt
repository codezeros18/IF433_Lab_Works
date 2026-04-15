package oop_00000126968_lintangbalakosaardhana.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)

    order.customer?.address?.city?.let {
        println("Kota ditemukan: $it")
    }

    val mixedList: List<Any> = listOf("Hello", 123, "World", 45.6)
}