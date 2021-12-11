package controlFlow

fun main () {
    //  1
    val value = 7
    when(value) {
        6 -> println("value is 6")
        7 -> println("1. value is 7")
        8 -> println("value is 8")
    }

    //  2
    val valuee = 20
    when(valuee) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("2. Value cannot be reached")
    }

    //  3
    val valueee = 8
    val stringOfValue = when(valueee) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("3. value is 8")
        else -> print("Value cannot be reached")
    }
    println(stringOfValue)

    //  4
    val valueeee = 6
    val stringOfValuee = when (valueeee) {
        6 -> {
            println("4. ini adalah angka 6")
            "4. Value nya adalah 6"
        }
        7 -> {
            println("Ini adalah angka 7")
            "Value nya adalah 7"
        }
        8 -> {
            println("Ini adalah angka 8")
            "Value nya adalah 8"
        }
        else -> {
            println("Undefined")
            "Value cannot be reached"
        }
    }
    println(stringOfValuee)

    //  5
    val anytype: Any = "Hallo gengs"
    when (anytype) {
        is Long -> println("5. The value has a long type")
        is String -> println("5. The value has a string type")
        else -> println("5. undefined")
    }

    //  6
    val values = 50
    val ranges = 10..50

    when(values) {
        in ranges -> println("6. = The value is in the range")
        !in ranges -> println("6. = The value is outside the range")
        else -> println("6. value undefined")
    }

    //  7. if expression digunakan jika kondisi yang diberikan tidak lebih dari 2 kondisi.
    val anyTypee : Any = 100L
    if (anyTypee is Long) {
        println("7. The value has a long type")
    } else {
        println("7. The value is not a long type")
    }

    //  8. when expression digunakan jika kondisi yang diberikan lebih dari 2 kondisi.
    val anyTypeee : Any = 100L
    when (anyTypeee) {
        is Long -> println("8. This value has a long type")
        is Int -> println("8. This value has a int type")
        is Double -> println("8. This value has a double type")
        else -> println("8. undefined")
    }
}