package objectOrientedProgramming

class Animal (val name: String,
              val berat: Double,
              val umur: Int,
              val jenisMamalia: Boolean
              )
{
    fun eat() {
        println("$name ayo makan! ")
    }
    fun sleep() {
        println("$name sana tidur! ")
    }
    fun umur() {
        println("Apakah ming-ming berumur $umur tahun? Ya benar! ming-ming berusia $umur tahun")
    }
}

fun main() {
    val kucingHaiqal = Animal("Ming-ming", 5.01, 4, true)
    println("Nama kucingku adalah ${kucingHaiqal.name}, beratnya ${kucingHaiqal.berat} kg, umurnya baru ${kucingHaiqal.umur} tahun," +
            " apakah termasuk mamalia?: ${kucingHaiqal.jenisMamalia}")
    kucingHaiqal.eat()
    kucingHaiqal.sleep()
    kucingHaiqal.umur()
}