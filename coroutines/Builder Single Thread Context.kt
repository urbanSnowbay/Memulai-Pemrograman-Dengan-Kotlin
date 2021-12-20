package coroutines

/*
Bersamaan dengan objek-objek tersebut, ada beberapa builder yang dapat digunakan untuk menentukan thread yang dibutuhkan:
    Single Thread Context
Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan. Untuk menerapkannya,
Anda bisa memanfaatkan newSingleThreadContext()seperti kode dibawah ini:
*/

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(3000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}
