package oop_00000126968_lintangbalakosaardhana.week14

interface Printable {

    fun print()
}

interface Scannable {

    fun scan()
}

interface Faxable {

    fun fax()
}

class BetterPrinter : Printable {

    override fun print() {
        println("Printing document...")
    }
}