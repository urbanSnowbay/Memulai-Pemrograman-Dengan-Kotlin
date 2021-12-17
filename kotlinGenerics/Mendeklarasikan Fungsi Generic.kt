package kotlinGenerics

/* fun <T> run(): T {
    return
} */

/* public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    return
} */ // Contoh penerapan fungsi generic, deklarasi fungsi slice yang merupakan extensions function dari kelas*

fun main() {
    val angka = (1..100).toList()
    println(angka.slice(1..10))
}