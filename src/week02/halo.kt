package week02

val name: String? = null
val length = name?.length ?: -1
println(length)