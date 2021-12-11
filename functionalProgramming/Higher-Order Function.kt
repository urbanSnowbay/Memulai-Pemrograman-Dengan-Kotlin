package kotlinFunctional

fun main() {
    printResult(10, tambah)
}

fun printResult(nilai: Int, tambah: (Int) -> Int) {
    val hasil = tambah(nilai)
    println(hasil)
}

var tambah: (Int) -> Int = {
    nilai -> nilai + nilai
}

