package week08

fun main(){
    var nama: String? = "Lintang Gacor"
    try{
        println("nama kamu ${nama!!.uppercase()}")
    } catch (ex: Exception){
        println("errornya adalah ${ex.message}")
    }

    var dataMhs: List<Any> = listOf(123, "Lintang", 90, "Rajeg")
    for(item in dataMhs){
        var itemFilter = item as? String
        if(itemFilter!=null){
            println(itemFilter)
        }
    }
}