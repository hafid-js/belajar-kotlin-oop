package app

import data.Operation
import data.Operation.Plus
import data.Operation.Minus
import data.Operation.Modulo

fun operation(value1 : Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))

}