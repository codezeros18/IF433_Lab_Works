package oop_00000126968_lintangbalakosaardhana.week14

interface Shape {

    fun area(): Int
}

class BetterRectangle(
    private val width: Int,
    private val height: Int
) : Shape {

    override fun area(): Int {
        return width * height
    }
}

class BetterSquare(
    private val side: Int
) : Shape {

    override fun area(): Int {
        return side * side
    }
}