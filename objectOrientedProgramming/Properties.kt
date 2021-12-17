package objectOrientedProgramming

class Binatangz {
    var name: String = "Kucing Haiqal"
        get() {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main() {
    val kucingHaiqal = Binatangz()
    println("nama: ${kucingHaiqal.name}")
    kucingHaiqal.name = "Bebek"
    println("nama: ${kucingHaiqal.name}")
}