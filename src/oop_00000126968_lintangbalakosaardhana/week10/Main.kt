package oop_00000126968_lintangbalakosaardhana.week10

fun main() {
    val intBox = Box(10)
    val stringBox = Box("Hello")

    println(intBox.value)
    println(stringBox.value)

    val pair = PairBox("Age", 20)
    println("${pair.key} = ${pair.value}")

    printData(3.14)
    printData("Generic Test")

    val result = getData("Return Value")
    println(result)
}