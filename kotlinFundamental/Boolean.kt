fun main() {
    //Conjunction atau AND (&&)
    //Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.
    val kantorBuka = 07.00
    val kantorTutup = 18.00
    val jamSekarang = 20.00

    val buka = jamSekarang >= kantorBuka && jamSekarang <= kantorTutup

    println("Kantor sudah buka : $buka")

    //Disjunction atau OR (||)
    //Berbeda dengan operator AND (&&), operator OR (||) akan mengembalikan nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true.
    val officeOpen = 07.00
    val officeClosed = 18.00
    val now = 20.00

    val closed = now < officeOpen || now > officeClosed

    println("Kantor sudah tutup : $closed")

    //Negation atau NOT (!)
    //Berbeda dengan operator AND (&&) dan operator OR(||), operator NOT(!) digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan.
    val kantorBukaa = 07.00
    val kantorTutupp = 18.00
    val jamSekarangg = kantorBukaa < kantorTutupp

    if(!jamSekarangg) {
        println("kantor sudah buka")
    } else {
        println("kantor sudah tutup")
    }
}