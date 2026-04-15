package oop_00000126968_lintangbalakosaardhana.week06

class Smartphone : Camera, Phone {

    override fun takePhoto() {
        super<Camera>.takePhoto()
        super<Phone>.takePhoto()
    }
}