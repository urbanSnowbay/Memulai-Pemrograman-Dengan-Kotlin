package `Data Classes & Collections`

fun main() {
    val set = setOf(1, 2, 3, 1, 2, 4, 5)
    println("1. $set")

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(setA == setB)
    println(6 in setA)
    println("4. $union")
    println("5. $intersect")

    // Pada Mutable Set kita bisa menambah dan menghapus item, namun tak bisa mengubah nilai seperti pada List
    val mutableSet = mutableSetOf(1, 2, 4, 2, 5, 7)
    mutableSet.add(10) // Menambah item di akhir set
    mutableSet.remove(7) // menghapus item yang memiliki nilai 7
    println(mutableSet)
}