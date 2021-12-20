package coroutines

import kotlinx.coroutines.*

suspend fun getKapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getInkome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val capital = async { getKapital() }
    val income = async { getInkome() }
    println("Profitmu adalah ${income.await() - capital.await()}")
}
// kapital dan inkome adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.