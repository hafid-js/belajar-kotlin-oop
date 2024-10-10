package app

import data.Handphone
import data.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is Handphone) {
        println("Handphone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {

        is Laptop -> println("Laptop with name ${any.name}")
        is Handphone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any : Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any : Any) {
    val value: String? = any as? String
    println(value)
}



fun main() {
    printString("Eko")
//    printString(1)

    printStringSafe("Eko")
    printStringSafe(1)


    printObjectWithWhen("Eko")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(Handphone("Samsung"))
}