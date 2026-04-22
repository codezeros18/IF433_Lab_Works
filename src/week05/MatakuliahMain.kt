package week05

fun main(){
    val listMatkul:List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    )
    println("banyak tipe matkul : $listMatkul")

    for(mku in listMatkul){
        mku.set_matkul(3)
        if(mku is Wajib){
            mku.ada_seminar()
        } else if(mku is Elective){
            mku.ada_praktek()
        }
        when(mku){
            is Wajib -> {
                println("Wajib dari when")
                mku.ada_seminar()
            }
            is Elective -> {
                println("Elective dari when")
                mku.ada_praktek()
            }
        }

    }
}