package objectOrientedProgramming

fun main() {
    // -----Arithmetic Exception-----
    val someValue = 6
    println(someValue / 0) // Exception in thread "main" java.lang.ArithmeticException: / by zero


    // -----Number Format Exception-----
    val sebuahAngka = "8.0"
    println(sebuahAngka.toInt()) // Exception in thread "main" java.lang.NumberFormatException: For input string: "8.0"

    // -----Null Pointer Exception-----
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue) // Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
}