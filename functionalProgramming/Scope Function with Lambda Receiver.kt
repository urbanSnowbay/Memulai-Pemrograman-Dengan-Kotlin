package kotlinFunctional

fun main() {
    // --------------run--------------
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "Replace from $from to $to"
    }
    println("Hasilnya = $result")

    // --------------with--------------
    val message = "Hello Kotlin!"
    val kupret = with(message) {
        println("value is $this") // value is Hello Kotlin!
        println("with length ${this.length}") // with length 13
    }

    val pesan = "Haiqal Ganteng"
    val hasil = with(pesan) {
        "Karakter pertama adalah ${this[0]}" +
                " dan karakter terakhir adalah ${this[this.length - 1]}"
    }
    println(hasil) // Karakter pertama adalah H dan karakter terakhir adalah g

    // --------------contoh tanpa fungsi apply--------------
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("World ")
    println(builder.toString())

    // --------------contoh menggunakan fungsi apply--------------
    val bangun = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }
    println(bangun.toString())
}