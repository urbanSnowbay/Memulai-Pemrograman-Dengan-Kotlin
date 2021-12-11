package controlFlow

fun main() {
    val range = 5..10
    print(range.step)
    println()
    //   output: 1 (Nilai 1 adalah nilai default dari step)

    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
    //  output: 1 3 5 7 9 2

    val sepuluhKeSatu = 10.downTo(1)
    if (5 in sepuluhKeSatu ) {
        println("Value 5 is available")
    } else {
        println("Value 5 isn't available")
    }
    //  output: Value 5 is available

    if (1 <= 7 && 7 <= 10) {
        println("Value 7 is available")
    }
    //  output: Value 7 is available

    val tenToOne = 10.downTo(1)
        if (11 !in tenToOne) {
            println("11 is available")
        } else {
            println("11 isn't available")
        }
    //  output: 11 is available

    val rangeChar = 'A'.rangeTo('F')
        if ('B' in rangeChar) {
            println("B termasuk ke dalam lingkup F")
        } else {
            println("B tidak termasuk ke dalam lingkup F")
        }
}

