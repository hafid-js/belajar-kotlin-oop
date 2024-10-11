package data

import data.Employee.*

fun main() {
    var employee: Employee = Employee("Eko")
    employee.sayHello("Budi")

    employee = Manager("Eko")
    employee.sayHello("Budi")

    employee = VicePresident("Eko")
    employee.sayHello("Budi")
}