package objectOrientedProgramming

/* abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek. Maka dari itu konsep abstract class perlu diterapkan agar kelas Animal 
tidak dapat direalisasikan dalam bentuk objek namun tetap dapat menurunkan sifatnya kepada child class-nya.

abstract class sebuahBinatang(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {

    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}

fun main() {
    val binatang = sebuahBinatang("Dicoding Animal", 2.1, 2, true)
} */
