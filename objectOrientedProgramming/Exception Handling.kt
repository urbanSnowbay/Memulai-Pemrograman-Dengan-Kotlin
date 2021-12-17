package objectOrientedProgramming

fun main() {
    // -----try-catch-----
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai string null"
        println(someMustNotNullValue)
    }

    // -----try-catch-finally-----
    val sebuahNullValue: String? = null
    lateinit var sebuahMustNotNullValue: String

    try {
        sebuahMustNotNullValue = sebuahNullValue!!
        println(sebuahMustNotNullValue)
    } catch (e: Exception) {
        sebuahMustNotNullValue = "Nilai string null"
    } finally {
        println(sebuahMustNotNullValue)
    }

    // -----Multiple Catch-----
    val sebuahNilaiString: String? = "12."
    var sebuahNilaiInt: Int = 1

    try {
        sebuahNilaiInt = sebuahNilaiString!!.toInt()
    } catch (e: NullPointerException) {
        sebuahNilaiInt = 0
    } catch (e: NumberFormatException) {
        sebuahNilaiInt = -1
    } finally {
        when (sebuahNilaiInt) {
            0 -> println("Catch block NullPointerException terpanggil!")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(sebuahNilaiInt)
        }
    }
        // jika sebuahNilaiString bernilai null, maka "Catch block NullPointerException terpanggil !"
        // jika sebuahNilaiString bernilai 12.0, maka "Catch block NumberFormatException terpanggil !"
        // jika sebuahNilaiString bernilai  12,  maka akan bernilai 12
}