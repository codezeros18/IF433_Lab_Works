package oop_00000126968_lintangbalakosaardhana.week12

fun divide(a: Int, b: Int): Result<Int> {

    return runCatching {
        a / b
    }
}