package oop_00000126968_lintangbalakosaardhana.week14

open class Rectangle {

    open var width: Int = 0
    open var height: Int = 0

    fun area(): Int {
        return width * height
    }
}

class Square : Rectangle() {

    override var width: Int
        get() = super.width
        set(value) {
            super.width = value
            super.height = value
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.width = value
            super.height = value
        }
}