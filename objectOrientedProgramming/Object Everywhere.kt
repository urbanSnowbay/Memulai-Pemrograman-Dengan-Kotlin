package objectOrientedProgramming

fun main() {
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())

    println("-------------------")

    val sebuahString = "123"
    val ubahString = sebuahString.toInt()
    val sebuahAngka = 123
    val ubahAngka = sebuahAngka.toDouble()
    println(ubahString is Int)
    println(ubahAngka is Double)
}
