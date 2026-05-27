package oop_00000126968_lintangbalakosaardhana.week14

interface Database {

    fun connect()
}

class MySQLDB : Database {

    override fun connect() {
        println("MySQL Connected")
    }
}

class PostgreSQLDB : Database {

    override fun connect() {
        println("PostgreSQL Connected")
    }
}