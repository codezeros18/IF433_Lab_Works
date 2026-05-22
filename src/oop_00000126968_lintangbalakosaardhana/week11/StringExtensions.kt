package oop_00000126968_lintangbalakosaardhana.week11

fun String.helloExtension(): String {
    return "Hello, $this"
}

fun String?.safeLength(): Int {
    return this?.length ?: 0
}