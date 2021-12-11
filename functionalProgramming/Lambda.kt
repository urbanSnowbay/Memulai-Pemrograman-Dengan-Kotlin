package kotlinFunctional

fun main() {
    // 1
    pesan()

    // 2
    printMessage("Hello from Lambda")

    // 3
    val length = messageLength("Hello from lambda")
    println("Panjang pesan \"Hello from lambda\" adalah: $length")
}

// 1
val pesan = {
    println("Hello World")
}

// 2
val printMessage = {
    message: String -> println(message)
}

// 3
val messageLength = {
    pesann: String -> pesann.length
}