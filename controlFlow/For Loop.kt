package controlFlow

fun main () {
    val ranges = 1..5
    for (i in ranges) {
        println("1. The value is $i!")
    }
    println("------------------")

    val rangess = 1.rangeTo(5)
    for (j in rangess) {
        println("2. Nilainya adalah $j!")
    }
    println("------------------")


    val rangesss = 1.rangeTo(10) step 3
    for (k in rangesss) {
        println("3. Nilainya adalah $k")
    }
    println("------------------")

    val jarak = 1.rangeTo(10) step 3
    for ((index, value) in jarak.withIndex()) {
        println("4. Nilainya adalah $value, indexnya adalah $index")
    }
    println("------------------")

    val jarakk = 1.rangeTo(15) step 3
    jarakk.forEach {value ->
        println("5. Nilainya adalah $value")
    }
    println("------------------")

    val jarakkk = 1.rangeTo(15) step 3
    jarakkk.forEachIndexed{index, value ->
        println("6. Nilainya adalah $value, indexnya adalah $index")
    }
    println("------------------")

    val jarakkkk = 1.rangeTo(15) step 3
    jarakkkk.forEachIndexed{index, _ ->
        println("7. Indexnya adalah $index")
    }
}