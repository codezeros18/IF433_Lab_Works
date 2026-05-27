package oop_00000126968_lintangbalakosaardhana.week14


import java.io.File

class BadOrderProcessor {

    fun processOrder(
        customerType: String,
        price: Double
    ) {

        val finalPrice = when (customerType) {

            "VIP" -> price * 0.8

            "REGULAR" -> price * 0.9

            else -> price
        }

        println("Save order ke CSV")

        println("Send email notification")

        println("Final price: $finalPrice")
    }
}

interface OrderRepository {

    fun saveOrder(data: String)
}

class CsvOrderRepository : OrderRepository {

    override fun saveOrder(data: String) {

        File("orders.csv")
            .printWriter()
            .use {

                it.println(data)
            }
    }
}

interface NotificationService {

    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {

        println("Email: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
)

interface PricingStrategy {

    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.8
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.9
    }
}

fun processOrder(
    strategy: PricingStrategy,
    price: Double
) {

    val finalPrice = strategy.calculate(price)

    println("Final Price: $finalPrice")
}