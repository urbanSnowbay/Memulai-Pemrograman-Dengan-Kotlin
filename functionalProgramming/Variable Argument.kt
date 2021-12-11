package kotlinFunctional

fun main() {
    // 1
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    // 2
    val angka = getNumberSize(10, 20, 30, 40, 50)
    println(angka)

}

// 1
fun sumNumbers(vararg number: Int): Int {
    return number.sum() //  100
}

// 2
fun getNumberSize(vararg angka: Int): Int {
    return angka.size //    5
}

