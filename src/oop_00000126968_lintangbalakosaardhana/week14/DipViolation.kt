package oop_00000126968_lintangbalakosaardhana.week14

class MySQLDatabase {

    fun connect() {
        println("Connect MySQL")
    }
}

class UserService {

    private val database = MySQLDatabase()

    fun register() {
        database.connect()
    }
}