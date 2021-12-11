fun main() {
    val nama = "Haiqal"
    val umur = 20
    println("Hallo $nama, apakah kamu berumur $umur tahun?")

    val kantorBukaJam = 07.00
    val jamSekarang = 15.00
    print("Kantor sudah ${if (jamSekarang > kantorBukaJam)"buka" else "tutup"}")
}