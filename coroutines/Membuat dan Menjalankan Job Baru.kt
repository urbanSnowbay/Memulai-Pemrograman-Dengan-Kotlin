package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    // start() akan memulai job tanpa harus menunggu job tersebut selesai
    val job = launch(start = CoroutineStart.LAZY) {
        delay(3000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")

    // join() akan menunda eksekusi sampai job selesai
    val kerja = launch(start = CoroutineStart.LAZY) {
        delay(5000L)
        println("Mulai kerja baru!")
    }

    kerja.join()
    println("Tugas lainnya")
}