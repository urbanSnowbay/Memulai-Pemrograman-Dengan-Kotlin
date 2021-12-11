package kotlinFunctional

fun main() {
    // --------------fold()--------------
    // 1
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("***Fold result: $fold***")
    println()
    // --------------foldRight()--------------
    // 2
    val angka = listOf(1, 2, 3)
    val lipatan = angka.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("***Hasil lipatan: $lipatan***")
    println()

    // --------------drop()--------------
    // 3
    val numberss = listOf(1, 2, 3, 4, 5, 6)
    val pangkas = numberss.drop(3)
    println(pangkas) // [4, 5, 6]

    // --------------dropLast()--------------
    // 4
    val angkaa = listOf(1, 2, 3, 4, 5, 6)
    val pangkass = angkaa.dropLast(3)
    println(pangkass) // [1, 2, 3]

    // --------------take()--------------
    // 5
    val total = listOf(6, 7, 8, 9, 10)
    val ambil = total.take(3)
    println(ambil) // [6, 7, 8]

    // --------------takeLast()--------------
    // 6
    val totall = listOf(6, 7, 8, 9, 10)
    val ambill = totall.takeLast(3)
    println(ambill) // [8, 9, 10]

    // 1


    // 2


    // 3


    // 4


    // 5


    // 6

}