package kotlinFunctional

fun main() {
    // --------------Lambda Receiver (this, apply, run, with)--------------
    // 1
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("World ")

    }
    println(buildString)

    // --------------Lambda Argument (let, also)--------------
    // 2
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    // (Merubah default argument 'it')
    // still 2
    val teks = "Merubah argument default it menjadi value"
    teks.let {value ->
        val pesan = "$value"
        println(pesan)
    }
}
