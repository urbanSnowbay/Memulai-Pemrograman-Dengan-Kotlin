package controlFlow

fun main () {
    //1
    val colorRed = Color.RED
    val colorBlue = Color.BLUE
    val colorGreen = Color.GREEN

    //2
    val warna : Warna = Warna.HIJAU
    println("2. $warna")

    //3
    val colors : Array<Colorss> = Colorss.values()
    colors.forEach { color ->
        println("3. $color")
    }

    //4
    val warnaa: Warnaa = Warnaa.valueOf("RED")
    println("4. The color is $warnaa")
}

//  1
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//  2
enum class Warna {
    MERAH, KUNING, HIJAU
}

//  3
enum class Colorss(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//  4
enum class Warnaa (val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


