package kotlinFunctional

fun main() {
    hasilPrint(10) { value->
        value + value
     }
}

fun hasilPrint(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}