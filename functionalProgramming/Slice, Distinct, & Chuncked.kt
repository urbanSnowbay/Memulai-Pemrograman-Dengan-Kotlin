package kotlinFunctional

fun main() {
    // --------------slice()--------------
    // 1
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(6..9)
    println(slice) // [7, 8, 9, 10]

    // --------------slice() with step range--------------
    // 2
    val totall = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val potong = totall.slice(6..9 step 2)
    println(potong) // [7, 9]

    // --------------slice() tapi dengan lebih spesifik lagi--------------
    // 3
    /*  dari angka 2 ke 3 itu +1,
    *   angka 3 ke 5 +2,
    *   angka 5 ke 8 +3
    */
    val indexx = listOf(2, 3, 5, 8)
    val totalll = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slicee = totalll.slice(indexx)
    println(slicee) // [3, 4, 6, 9]

    // --------------distinct()--------------
    // 4
    val data = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val olah = data.distinct()
    println(olah) // [1, 2, 3, 4, 5]

    // --------------distinct() menyaring parameter key--------------
    // 5
    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "Is"),
        Item("3", "Awesome"),
        Item("3", "As"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    } /* 1 with value Kotlin
       * 2 with value Is
       * 3 with value Awesome
       */

    // --------------distinctBy() menyaring item yg memiliki panjang yg sama--------------
    // 6
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val saring = text.distinctBy {
        it.length
    }
    println(saring)
    // distinct() tidak dapat digunakan pada object ma[ collection

    // --------------chunked()--------------
    val word = "HAIQAL"
    val chunked = word.chunked(3)
    println(chunked) // [HAI, QAL]

    // --------------chunked() diubah ke lowerCase--------------
    val kata = "QWERTY"
    val pisah = kata.chunked(2) {
        it.toString().toLowerCase()
    }
    println(pisah)
}
