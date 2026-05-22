package oop_00000126968_lintangbalakosaardhana.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {

    if (isJammed) {
        throw FeederJammedException("Mesin feeder macet!")
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException("Stok makanan tidak cukup!")
    }

    return availableGram - requestedGram
}