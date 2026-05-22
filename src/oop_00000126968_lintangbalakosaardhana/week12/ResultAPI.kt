package oop_00000126968_lintangbalakosaardhana.week12

fun divide(a: Int, b: Int): Result<Int> {
    divide(10, 2)
        .onSuccess {
            println("Hasil: $it")
        }
        .onFailure {
            println("Error: ${it.message}")
        }

    divide(10, 0)
        .onSuccess {
            println("Hasil: $it")
        }
        .onFailure {
            println("Error: ${it.message}")
        }

    return runCatching {
        a / b
    }


}