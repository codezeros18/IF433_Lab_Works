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

class EmailService {

    fun sendEmail(name: String) {
        println("Kirim email ke $name")
    }
}

fun main() {

    val validator = UserValidator()
    val repository = UserRepository()
    val emailService = EmailService()

    val username = "Tony"

    if (validator.validate(username)) {

        repository.save(username)

        emailService.sendEmail(username)
    }
}