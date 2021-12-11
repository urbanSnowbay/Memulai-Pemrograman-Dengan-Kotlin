package kotlinFunctional

fun main() {
    // --------------let--------------

    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
    // --------------contoh tanpa menggunakan let--------------
    val pesan: String? = null
    val panjang = pesan?.length ?: 0 * 2
    val teks = "text length $panjang"
    println(teks) // text length 0

    // --------------contoh let menggunakan fungsi run dan elvis operator jika objeknya null--------------
    val messagee: String? = null
    messagee?.let {
        val lengthh = it.length * 2
        val textt = "text length $lengthh"
        println(textt)
    } ?: run {
        val textt = "Message is null"
        println(textt) // Message is null
    }

    // --------------also--------------
    val pesann = "Haiqal"
    val hasill = pesann.also {
        println("Panjang nilai -> ${it.length}")
    }
    println("text -> $hasill") // Panjang nilai -> 6
}                              // text -> Haiqal