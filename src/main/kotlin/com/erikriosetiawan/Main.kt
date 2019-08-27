package com.erikriosetiawan

fun main() {
    val derivedClass = DerivedClass()
    derivedClass.foo()

    val ninja = Ninja()
    ninja.jump()
    ninja.sneak()

    val car: Car = BrokenCar("Lada")
    car.speed = 10
}