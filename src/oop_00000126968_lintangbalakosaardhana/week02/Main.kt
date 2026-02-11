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

        3 -> {
            print("\nMasukkan Nama Hero: ")
            val heroName = scanner.nextLine()

            print("Masukkan Base Damage: ")
            val damage = scanner.nextInt()

            val hero = Hero(heroName, damage)
            var enemyHp = 100
            val enemyName = "Goblin"

            println("\n=== BATTLE START ===")

            while (hero.isAlive() && enemyHp > 0) {
                println("\nHP ${hero.name}: ${hero.hp}")
                println("HP $enemyName: $enemyHp")
                println("1. Serang")
                println("2. Kabur")
                print("Pilih: ")

                val choice = scanner.nextInt()

                if (choice == 1) {
                    hero.attack(enemyName)
                    enemyHp -= hero.baseDamage
                    if (enemyHp < 0) enemyHp = 0

                    println("HP $enemyName tersisa: $enemyHp")

                    if (enemyHp > 0) {
                        val enemyDamage = (10..20).random()
                        println("$enemyName menyerang balik! Damage: $enemyDamage")

                        hero.takeDamage(enemyDamage)
                        println("HP ${hero.name} tersisa: ${hero.hp}")
                    }

                } else if (choice == 2) {
                    println("${hero.name} kabur!")
                    break
                }
            }

            println("\n=== HASIL ===")
            if (hero.hp > 0 && enemyHp == 0) {
                println("${hero.name} MENANG!")
            } else if (hero.hp == 0 && enemyHp > 0) {
                println("$enemyName MENANG!")
            } else {
                println("Pertarungan selesai tanpa pemenang.")
            }
        }

        else -> println("Menu tidak valid")
    }
}
