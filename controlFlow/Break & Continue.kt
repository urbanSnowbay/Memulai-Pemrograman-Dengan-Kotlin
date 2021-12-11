package controlFlow

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, 6, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
    println()

    val listOfIntt = listOf(1, 2, 3, null, 5, 6, null, 7)

    for(k in listOfIntt) {
        if (k == null) break
        print(k)
    }
    println()

    loop@ for (z in 1..10) {
        println("Outside Loop")

        for (q in 1..10) {
            println("Inside Loop")
            if (q > 2) break@loop
       }
    }
}