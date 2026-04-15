package oop_00000126968_lintangbalakosaardhana.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    method.pay(amount)
}

fun main() {

    val lamp = SmartLamp("1", "Lampu Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
}