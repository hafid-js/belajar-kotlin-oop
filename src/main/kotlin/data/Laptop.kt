package data

class Laptop(val name: String)

open class Handphone(val name: String)

class Smartphone(name: String, val os: String) : Handphone(name)