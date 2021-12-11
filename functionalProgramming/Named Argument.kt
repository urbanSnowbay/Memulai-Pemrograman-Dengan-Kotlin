package kotlinFunctional

fun main() {
    val fullName = getFullName (pertama = "Haiqal", kedua = "Mochammad", ketiga = "Satria", keempat = "Utama")
    print (fullName)
}

fun getFullName(pertama: String, kedua: String, ketiga: String, keempat: String): String {
    return "$pertama $kedua $ketiga $keempat"
}