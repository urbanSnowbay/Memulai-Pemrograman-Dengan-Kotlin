package kotlinFunctional

fun main() {
    println(factorial(4))
    println(faktorial(4))
}

// bilangan faktorial 4! = 4x3x2x1 menggunakan recursion
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

// ---------Tail Call Recursion, agar tidak terjadi penumpukan frame---------
tailrec fun faktorial(n: Int, result: Int = 1):Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        faktorial(n - 1, newResult)
    }
}
// ada kode di atas, modifier tailrec ditempatkan sebelum kata kunci fun. Ketika sebuah fungsi ditandai dengan modifier tailrec,
// maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.