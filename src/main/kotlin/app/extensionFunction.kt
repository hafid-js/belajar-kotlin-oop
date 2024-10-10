package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Eko", 19)
    student.sayHello("Budi")
    println(student?.upperName)
}