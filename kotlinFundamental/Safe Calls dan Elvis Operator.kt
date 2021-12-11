fun main() {
    //Safe Calls
    val text: String? = null
    text?.length

    //Elvis Operator
    val teks: String? = null
    val teksLength = teks?.length ?: 7
    println(teksLength)

    val textLength = if (text != null) text.length else 7
    print(textLength)

}