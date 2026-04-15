package oop_00000126968_lintangbalakosaardhana.week06

interface Clickable {
    val name: String = "Button" // ERROR (backing field)
    fun onClick()
}