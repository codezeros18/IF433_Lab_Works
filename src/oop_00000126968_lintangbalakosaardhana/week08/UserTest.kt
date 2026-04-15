package oop_00000126968_lintangbalakosaardhana.week08

fun runMockUnitTest() {
    val data: String? = null

    if (data == null) {
        println("Error: API Invalid: Missing ID")
    } else {
        println(data.length)
    }
}