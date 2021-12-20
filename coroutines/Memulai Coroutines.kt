package coroutines
import kotlinx.coroutines.*

/*
Coroutines merupakan library yg disediakan oleh JetBrains. Untuk itu, agar bisa menggunakannya Anda perlu menambahkan dependensi berikut
pada build.gradle.kts:
*/

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello, ")
    delay(2000L)
}