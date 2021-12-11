package controlFlow

fun main () {
    val openOffice = 7
    val time = 8
    val office = if (time > openOffice) "Kantor sudah buka" else "Kantor tutup"
    print(office)

    //Contoh di bawah ini, 1 dan 1*4 merupakan sebuah statements
    val value1 = 10
    val value2 = 10

    sum(value1, value2)
}

//Contoh di bawah ini, pemanggilan fungsi sum DAN value1 & value2 merupakan sebuah expressions untuk mengembalikan nilai
fun sum(value1: Int, value2: Int) = value1 + value2
