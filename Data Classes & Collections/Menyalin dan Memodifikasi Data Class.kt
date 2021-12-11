package `Data Classes & Collections`

fun main() {
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("Dimas", 24)
    val dataUser4 = dataUser.copy(age = 18) // fungsi copy() dapat memodifikasi objek

    println(dataUser4)
}