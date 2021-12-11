package `Data Classes & Collections`

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val stringList = listOf('a', 'b', 'c', 'd')
    val anyList = listOf('a', "Kotlin", 3, true)
    println("1. $numberList")
    println("2. $stringList")
    println("3. $anyList")
    println("------------------------")

    //  listOf mutable menggunakan fungsi mutableListOf()
    val mutableList = mutableListOf("Kotlin", 'k', 2, true)
    mutableList.add("ini huruf terakhir") // menambah item di akhir list
    mutableList.add(0, "Hai") // menambah item pada index 0
    mutableList[4] = false // mengubah item pada index 4 true menjadi false
    mutableList.removeAt(2) // menghapus item pada index 2
    println(mutableList)
}