package coroutines

/*
    Thread Pool
Sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia
pada kumpulan tersebut. Runtime akan menentukan thread mana yang tersedia dan juga menentukan bagaimana
proses distribusi bebannya.
Anda bisa menerapkan thread pool dengan fungsi newFixedThreadPoolContext() seperti berikut:
*/
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}