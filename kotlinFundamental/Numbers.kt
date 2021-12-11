fun main() {
    //Mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe Number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    //Memasukan nilai melebihi nilai maksimal yang dapat disimpan
    val maxIntt = Int.MAX_VALUE
    val minIntt = Int.MAX_VALUE +1

    println(maxIntt)
    println(minIntt)

    //Contoh operator penjumlahan,perkalian,pembagian, dan modulus(%)
    val numberOne = 10
    val numberTwo = 6

    println(numberOne % numberTwo)

    //Mengkonversi dari bentuk tipe data Bit ke Int
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()

    //Mengkonversi dari bentuk stringNumber yang awalnya berbentuk string menjadi Int
    val angkaString = "8"
    val angkaInt = 8

    println(angkaInt + angkaString.toInt())

    //Menggunakan underscores agar angka tersebut bisa dengan mudah terbaca atau "readable"
    val readable = 1_000_000_000
    print(readable)
}