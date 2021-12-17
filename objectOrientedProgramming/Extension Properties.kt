package objectOrientedProgramming

class binatang(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val binatang.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Apakah termasuk hewan mamalia?: ${this.isMammal}"

fun main() {
    val kucingHaiqal = binatang("Ming-ming", 5.01, 4, true)
    println(kucingHaiqal.getAnimalInfo)
}