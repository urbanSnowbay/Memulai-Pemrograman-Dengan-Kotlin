package kotlinFunctional

fun main() {
    val message = buildString {
        append("Hello ")
        append("From ")
        append("Lambda ")
    }

    println(message)
}

fun buildString(aksi: StringBuilder.() -> Unit): String {
    val bangunString = StringBuilder()
    bangunString.aksi()
    return bangunString.toString()
}