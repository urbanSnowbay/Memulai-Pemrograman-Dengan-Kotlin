package kotlinFunctional

fun main() {
    // 1
    println(18.slice)

    // 2
    val value: Int? = null
    println(value.potongan)

    // 3
    val nilai: Int? = null
    val nilai1: Int? = null

    println(nilai?.slicee)
    println(nilai1?.slicee)

    // 4
    val valuee: Int? = null
    val valuee1: Int? = null

    println(valuee.potongann)
    println(valuee1.potongann)
}

// 1
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2) // 9

// 2
val Int?.potongan: Int
    get() = this?.div(2) ?: 0 // 0

// 3
val Int.slicee: Int
    get() = this.div(2) // null
                             // null

// 4
val Int?.potongann: Int
    get() = this?.div(2) ?: 0 // 0
                                   // 0

