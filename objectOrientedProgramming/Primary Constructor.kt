package objectOrientedProgramming

// 1
class Animalll(val name: String, val age: Int, val weight: Double, val isMammal: Boolean)

// 2
class Binatangggg(val nama: String, val berat: Double, val umur: Int = 0, val apakahMamalia: Boolean = false)

// 3
class animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val nameee: String
    val weighttt: Double
    val ageee: Int
    val mamals: Boolean

    init {
        weighttt = if(pWeight < 0) 0.1 else pWeight
        ageee = if(pAge < 0) 0 else pAge
        nameee = pName
        mamals = pIsMammal
    }
}

// 4
class animall(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val nameeee: String
    val weightttt: Double
    val ageeee: Int
    val mamalss: Boolean

    init {
        this.weightttt = if(pWeight < 0) 0.1 else pWeight
        this.ageeee = if(pAge < 0) 0 else pAge
        this.nameeee = pName
        this.mamalss = pIsMammal
    }
}
fun main() {
    // 1
    val kucingHaiqal = Animalll("Ming-mingg", 4, 5.01, true)
    println("Nama: ${kucingHaiqal.name}, Umur: ${kucingHaiqal.age}, Berat: ${kucingHaiqal.weight}, Apakah ming-ming berjenis mamalia?: ${kucingHaiqal.isMammal}")

    // 2
    val kucingHaiqall = Binatangggg("ming-ming", 5.1, apakahMamalia = true) // properti apakahMamalia ditetapkan sebagai nilai default
    println("Nama: ${kucingHaiqall.nama}, Umur: ${kucingHaiqall.umur}, Berat: ${kucingHaiqall.berat}, mamalia bukan si?: ${kucingHaiqall.apakahMamalia}")

    // 3
    val haiqalKucingg = animal ("Dicoding Meow", 12.4, 0, true)
    println("Namanya siapa?: ${haiqalKucingg.nameee}, Umurnya?: ${haiqalKucingg.ageee}, Beratnya?: ${haiqalKucingg.weighttt}, Termasuk jenis apa?: ${haiqalKucingg.mamals}")

    // 4
    val haiqalKucing = animall ("Dicoding Meow", 12.4, 0, true)
    println("Namanya siapa?: ${haiqalKucing.nameeee}, Umurnya?: ${haiqalKucing.ageeee}, Beratnya?: ${haiqalKucing.weightttt}, Termasuk jenis apa?: ${haiqalKucing.mamalss}")
}

