package oop_00000126968_lintangbalakosaardhana.week14

interface DiscountStrategy {

    fun calculate(price: Double): Double
}

class VipDiscount : DiscountStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.8
    }
}

class RegularDiscount : DiscountStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.9
    }
}

class SafeDiscountCalculator(
    private val strategy: DiscountStrategy
) {

    fun calculate(price: Double): Double {
        return strategy.calculate(price)
    }
}