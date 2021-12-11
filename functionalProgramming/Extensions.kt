package kotlinFunctional

fun main() {
    // ------------------Extensions Functions------------------ //
    // 1
    10.diPrintDong()

    // 2
    println(10.tambahTiga())

    // ------------------Extensions Properties------------------ //
    // 3
    println(20.slice)
}

// 1
fun Int.diPrintDong() {
    println("valuenya adalah $this") // valuenya adalah 10
}

// 2
fun Int.tambahTiga(): Int {
    return this + 3 // 13
}

// 3
val Int.slice: Int
get() = this / 2 // 10