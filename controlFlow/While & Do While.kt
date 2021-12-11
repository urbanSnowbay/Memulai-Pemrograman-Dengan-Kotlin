package controlFlow

fun main() {
    //Perulangan While
    var perulangan = 1
    println("Perulangan While: ")
    while (perulangan <= 7) {
        println("Hello World")
        perulangan++
    }

    //  Perulangan While tidak akan terprint, karna inisialisasi variable melebihi kondisi
    var counter = 8
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }

    //  Perulangan Do While
    var counterr = 1
    println("Perulangan Do While:")
    do {
        println("Hello World")
        counterr++
    } while (counterr <= 7)

}