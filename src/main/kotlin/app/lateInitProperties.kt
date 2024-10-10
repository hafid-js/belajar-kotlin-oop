package app

import data.Television

fun main() {
    val tv = Television()

    tv.initTelevision("Samsung")
    println(tv.brand)
}