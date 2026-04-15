package oop_00000126968_lintangbalakosaardhana.week07

class NetworkClient private constructor(
    val baseUrl: String
) {
    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}