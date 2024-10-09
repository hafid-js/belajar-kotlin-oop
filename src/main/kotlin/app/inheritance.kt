package app

import data.Employee.*

fun main() {
    val manager = Manager("Eko")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")
}