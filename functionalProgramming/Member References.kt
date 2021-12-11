package kotlinFunctional

// 3
var message = "Kotlin"

fun main() {
    // --------------Function References--------------
    // 1
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumbers)
    println(evenNumbers)

    // 2
    val angka = 1.rangeTo(10)
    val angkaGenap = angka.filter(Int::adalahAngkaGenap)
    println(angkaGenap)

    // --------------Property References--------------
    // 3
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}

// 1
fun isEvenNumbers(angka: Int) = angka % 2 == 0

// 2
fun Int.adalahAngkaGenap() = this % 2 == 0