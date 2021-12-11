package controlFlow

fun main() {

    //1
    val colorsss : Array<Colors> = enumValues()
    colorsss.forEach {color ->
        println("1. $color")
    }
    val color : Colors = enumValueOf("BLUE")
    println("1. The color is $color")

    //2
    val warnaaa : Warnaaa = Warnaaa.GREEN
    println("2. Posisi dari warna hijau adalah ${warnaaa.ordinal}")

    //3
    val warnaaaa : Warnaaaa = Warnaaaa.GREEN
    when (warnaaaa) {
        Warnaaaa.GREEN -> print("3. The color is GREEN")
        Warnaaaa.RED -> print("3. The color is RED")
        Warnaaaa.BLUE -> print("3. The color is BLUE")
    }
}

//1
enum class Colors (val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//2
enum class Warnaaa (val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//3
enum class Warnaaaa (val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

