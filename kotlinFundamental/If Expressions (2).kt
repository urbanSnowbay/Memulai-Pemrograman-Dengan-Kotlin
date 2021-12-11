fun main() {
    val jamBuka = 18.00
    val jamSekarang =  18.00
    val kantor: String

    kantor = if (jamSekarang > 18.00) {
        "Kantor sudah buka"
    } else if (jamSekarang == jamBuka) {
        "Tunggu sebentar, kantor mau buka nih"
    } else {
        "Kantor sudah tutup"
    }

    print(kantor)
}