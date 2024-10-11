package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Eko")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}