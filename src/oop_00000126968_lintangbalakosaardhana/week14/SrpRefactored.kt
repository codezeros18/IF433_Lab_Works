package oop_00000126968_lintangbalakosaardhana.week14

class UserValidator {

    fun validate(name: String): Boolean {
        return name.isNotBlank()
    }
}

class UserRepository {

    fun save(name: String) {
        println("Save $name ke database")
    }
}