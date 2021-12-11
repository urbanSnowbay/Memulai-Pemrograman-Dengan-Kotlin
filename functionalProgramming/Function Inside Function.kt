package kotlinFunctional

fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }
    printMessage(message)
}

fun setKata(pesan: String) {
    fun printPesan() {
        println(pesan)
    }
    printPesan()
}

//
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    if (valueA == 0) {
        throw IllegalArgumentException("Value A must be better than 0")
    }
    if (valueB == 0) {
        throw IllegalArgumentException("Value B must be better than 0")
    }
    if (valueC == 0) {
        throw IllegalArgumentException("Value C must be better than 0")
    }
    return valueA + valueB + valueC
}

fun innerCode(nilaiA: Int, nilaiB: Int, nilaiC: Int): Int {
    fun validasiAngka(nilai: Int) {
        if (nilai == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validasiAngka(nilaiA)
    validasiAngka(nilaiB)
    validasiAngka(nilaiC)

    return nilaiA + nilaiB + nilaiC
}

fun innerFun(bobotA: Int, bobotB: Int, bobotC: Int): Int {
    fun Int.validasiNumber() {
        if (this == 0) {
            throw IllegalArgumentException("Value must be better than 0")
        }
    }

    bobotA.validasiNumber()
    bobotB.validasiNumber()
    bobotC.validasiNumber()

    return bobotA + bobotB + bobotC
}