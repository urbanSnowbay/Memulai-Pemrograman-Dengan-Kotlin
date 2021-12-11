package `Data Classes & Collections`

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}
data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    println(user)
    println(dataUser)

    val dataUserr = DataUser("Haiqal", 20)
    val dataUserr2 = DataUser("Haiqal", 20)
    val dataUserr3 = DataUser("Dimas", 20)
    println(dataUserr.equals(dataUserr2)) //true
    println(dataUserr.equals(dataUserr3)) //false

    val userr = User("nrohmen", 17)
    val userr2 = User("nrohmen", 17)
    val userr3 = User("Dimas", 20)
    println(userr.equals(userr2)) //false
    println(userr.equals(userr3)) //false
}