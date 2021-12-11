package `Data Classes & Collections`

fun main () {
    //  Menyaring bilangan genap
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumber = numberList.filter { it % 2 == 0 }
    println("1. $evenNumber") // [2, 4, 6, 8, 10]

    //  Menyaring bilangan ganjil
    val notEvenNumber = numberList.filterNot { it %2 == 0 }
    println("2. $notEvenNumber") // [1, 3, 5, 7, 9]

    //  fungsi map() untuk membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
    val bilanganDikali5 = numberList.map { it * 5 }
    println("3. $bilanganDikali5") // [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    // fungsi count() untuk menghitung jumlah item yang ada di dalam collection
    println(numberList.count()) // 10

    // fungsi count() juga dapat untuk menambahkan lambda (kondisi) yang kelipatannya 3 ada berapa di dalam sebuah collection
    println(numberList.count {it %3 == 0}) // 3

    // fungsi find() / firstOfNull() digunakan untuk mencari bilangan angka ganjil pertama pada sebuah collection
    // fungsi lastOrNull() digunakan untuk mencari bilangan angka ganjil terakhir pada sebuah collection
    val firstOddNumber = numberList.find() { it %2 == 1}
    println("6. $firstOddNumber") // 1
    val lastOddNumber = numberList.lastOrNull() { it %2 == 1}
    println("7. $lastOddNumber") //  9

    //  fungsi first() & last() hampir sama seperti fungsi firstOfNull() d& lastOfNull()
    val first = numberList.first() { it <= 10}
    println("8. $first") // 1
    val last = numberList.last() { it <= 10}
    println("9. $last") // 10

    //  fungsi sum() digunakan untuk menjumlahkan semua data yang ada di collection
    val jumlah = numberList.sum()
    println("10. $jumlah") // 55

    //  fungsi sorted() secara default mengurutkan kata secara ascending, tetapi untuk descending kita bisa menggunakan sortedDescending()
    val kotlinChar = listOf('K', 'O', 'T', 'L', 'I', 'N')
    val ascendingSort = kotlinChar.sorted()
    println("11. $ascendingSort")
    val descendingSort = kotlinChar.sortedDescending()
    println("12. $descendingSort")
}
