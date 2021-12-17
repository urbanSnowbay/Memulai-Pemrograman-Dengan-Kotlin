package objectOrientedProgramming

// -----------------Private class-----------------
class oiOi(private var name: String, private var age: Int, private var berat: Double, private var mamalia: Boolean) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    fun setName(newName: String) {
        name = newName
    }

    fun setAge(newAge: Int) {
        age = newAge
    }
}
fun main() {
    // -----------------Private class-----------------

    val hadeh = oiOi("ming-ming", 2, 1.5, false)
    println(hadeh.getName()) // ming-ming
    println(hadeh.getAge()) // 2

    hadeh.setName("Bebek")
    println(hadeh.getName()) // Bebek

    hadeh.setAge(100)
    println(hadeh.getAge()) // 100
}