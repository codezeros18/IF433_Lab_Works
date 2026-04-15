package oop_00000126968_lintangbalakosaardhana.week08

fun sendNotification(user: UserProfile) {
    if (user.email != null) {
        println("Mengirim email ke ${user.email}")
    } else {
        println("Email tidak tersedia")
    }
}