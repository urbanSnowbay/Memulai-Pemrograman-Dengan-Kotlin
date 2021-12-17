package kotlinGenerics

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
} // Long digunakan sebagai tipe argumen untuk List, sehingga fungsi yang berada di dalamnya akan menggunakan Long sebagai tipe dasarnya.

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
} // tipe T digunakan untuk menentukan tipe argumen dari kelas tersebut saat diinisialisasi

interface List<P> {
    operator fun get(index: Int): P
} // tipe parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari sebuah fungsi.