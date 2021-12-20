package coroutines

import kotlinx.coroutines.*
@InternalCoroutinesApi

fun main() = runBlocking{
    val job = launch {
        delay(5000)
        println("Memulai pekerjaan baru!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Waktunya sudah habis!"))
    println("Sedang memasuki tahap cancelling...")
    if(job.isCancelled) {
        println("Pekerjaan telah berhasil dicancel karena ${job.getCancellationException().message}")
    }
}