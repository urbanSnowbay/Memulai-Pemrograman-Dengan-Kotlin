package coroutines

/*
Dispatcher.Unconfined ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.
Setelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.
*/
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(5000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}