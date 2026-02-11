package oop_00000126968_lintangbalakosaardhana.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== WEEK 02 PROGRAM MENU ===")
    println("1. PMB UMN")
    println("2. Library Loan System")
    println("3. Mini RPG Battle")
    print("Pilih program: ")
    val menu = scanner.nextInt()
    scanner.nextLine()

    when (menu) {

        1 -> {
            println("\n--- Aplikasi PMB UMN ---")
            print("Masukkan Nama: ")
            val name = scanner.nextLine()

            print("Masukkan NIM (Wajib 5 Character): ")
            val nim = scanner.next()
            scanner.nextLine()

            if (nim.length != 5) {
                println("ERROR")
                return
            }

            print("Pilih Jalur (1. Reguler, 2. Umum): ")
            val type = scanner.nextInt()
            scanner.nextLine()

            if (type == 1) {
                print("Masukkan Jurusan: ")
                val major = scanner.nextLine()

                val s1 = Student(name, nim, major)
                println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

            } else if (type == 2) {
                val s2 = Student(name, nim)
                println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
            } else {
                println("Pilihan ngawur, pendaftaran batal!")
            }
        }

        2 -> {
            print("\nMasukkan Judul Buku: ")
            val title = scanner.nextLine()

            print("Masukkan Nama Peminjam: ")
            val borrower = scanner.nextLine()

            print("Masukkan Lama Pinjam (hari): ")
            var duration = scanner.nextInt()

            if (duration < 0) {
                println("Durasi tidak valid, diubah jadi 1 hari.")
                duration = 1
            }

            val loan = Loan(title, borrower, duration)

            println("\n--- Detail Peminjaman ---")
            println("Judul Buku  : ${loan.bookTitle}")
            println("Peminjam    : ${loan.borrower}")
            println("Durasi      : ${loan.loanDuration}")
            println("Total Denda : Rp ${loan.calculateFine()}")
        }
    }
}
