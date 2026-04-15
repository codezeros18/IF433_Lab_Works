package oop_00000126968_lintangbalakosaardhana.week06

class Button(
    override val name: String
) : Clickable {

    override fun onClick() {
        println("$name diklik!")
    }
}