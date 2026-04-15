package oop_00000126968_lintangbalakosaardhana.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)

    order.customer?.address?.city?.let {
        println("Kota ditemukan: $it")
    }

    val mixedList: List<Any> = listOf("Hello", 123, "World", 45.6)

    for (item in mixedList) {
        val str = item as? String
        if (str != null) {
            println(str.length)
        }
    }

    for (item in mixedList) {
        val str = item as? String ?: "Default"
        println(str)
    }

    val risky: String? = null
    println(risky!!.length)
}