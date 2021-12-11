package kotlinFunctional

fun main() {
    val fullName = ambilNamaLengkap(pertama = "Dicoding")
    print(fullName)
}

fun ambilNamaLengkap (
    pertama: String = "Haiqal",
    kedua: String = "Mochammad",
    ketiga : String = "Satria",
    keempat: String = "Utama") : String {
    return "$pertama $kedua $ketiga $keempat"
}

