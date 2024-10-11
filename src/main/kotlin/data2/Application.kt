package data2

class Application(val name: String) {

    companion object {
        fun toUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}