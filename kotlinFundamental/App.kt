// Program pertama kotlin! ^^

fun main() {
    //Program Codingan pertama: Kotlin Fundamental
    var nama = "Haiqal"

    println("Hallo, nama saya " + nama)
    println(if (true) "Ya benar, nama saya Haiqal" else "Salah, nama saya bkn Haiqal")
    println()
    //Program Codingan pertama: Kotlin Fundamental

    //Program Codingan kedua: Data Types & Variable
    var name: String = " Haiqal"
    name = "Diganti jadi Haiqullll"

    println(name)
    println()
    //Program Codingan kedua: Data Types & Variable

    //Program Codingan kedua: Data Types & Variable
    var namaPertama = "Haiqal "
    var namaTerakhir = "Utama"

    println(namaPertama + namaTerakhir)
    println()
    //Program Codingan kedua: Data Types & Variable

    //Program Codingan kedua: Data Types & Variable
    var valueA: Int = 5
    var valueB = 15

    print(valueA + valueB)
    println()
    //Program Codingan kedua: Data Types & Variable

    //Program Codingan ketiga: Char
    var vocal = 'A'

    println("Vocal " + vocal++ )
    println("Vocal " + vocal++ )
    println("Vocal " + vocal++ )
    println("Vocal " + vocal-- )
    println("Vocal " + vocal-- )
    println("Vocal " + vocal-- )
    println("Vocal " + vocal-- )
    println()
    //Program Codingan ketiga: Char

    //Program Codingan keempat: String
    var text: String = "Kotlin"
    var hurufPertama = text[0]
    println("Huruf pertama pada kata $text adalah $hurufPertama")
    println()
    //Program Codingan keempat: String

    //Program Codingan keempat: String
    var teks = "Kotlin"
    for (char in teks) {
        print("$char ")
    }
    println()
    println()
    //Program Codingan keempat: String

    //Program Codingan keempat: Escaped String
    var statement = "Kotlin is \"Awesome!\""
    println(statement)
    println()
    //Program Codingan keempat: Escaped String

    //Program Codingan keempat: String
    var unicode = "Ini adalah lambang dari Unicode \u00A9"
    println(unicode)
    //Program Codingan keempat: String

    //Program Codingan keempat: Raw String
    var line = """
        Baris 1
        Baris 2
        Baris 3
        Baris 4
        """.trimIndent()
    println()
    println(line)

}

/*
    Multi-Line Comment
 */
