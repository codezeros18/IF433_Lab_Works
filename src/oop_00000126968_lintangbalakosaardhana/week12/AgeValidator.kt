package oop_00000126968_lintangbalakosaardhana.week12

fun validateAge(age: Int) {

    if (age < 18) {
        throw InvalidAgeException("Umur minimal 18 tahun")
    }

    println("Umur valid")
}