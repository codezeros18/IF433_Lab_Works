package oop_00000126968_lintangbalakosaardhana.week14

interface MultifunctionDevice {

    fun print()

    fun scan()

    fun fax()
}

class SimplePrinter : MultifunctionDevice {

    override fun print() {
        println("Printing...")
    }

    override fun scan() {}

    override fun fax() {}
}