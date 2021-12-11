package `Data Classes & Collections`

data class UserData(val nama: String, val umur: Int) {
    fun intro() {
        println("Nama saya $nama, umur saya $umur tahun")
    }
}

fun main() {
    // Deklarasi cara pertama
    val dataUser = DataUser("haiqal", 20)

    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, i am $age years old")

    //  Deklarasi cara kedua
    val dataUserr = DataUser("nrohmen", 17)
    val (namee, agee) = dataUserr
    println("My name is $namee, i am $agee years old")

    val aku = UserData("Joko", 40)
    aku.intro()
}