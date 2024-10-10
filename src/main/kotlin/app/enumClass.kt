package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()


    println(man)
    println(woman)
    println(allGenders.toList())

    man.showDescription()
    woman.showDescription()
}