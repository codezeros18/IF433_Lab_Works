package oop_00000126968_lintangbalakosaardhana.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- Aplikasi PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Character): ")
    val nim = scanner.next()
    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR")
    } else{
        println("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name,nim,major)
        println("Status: Pendaftaran Selesai.")
    }
}