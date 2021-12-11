package `Data Classes & Collections`

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "New Delhi" to "India",
        "Paris" to "France"
        //  "Key" itu ibarat nama kotanya, sedangkan "Value" itu ibarat negaranya
        // getValue() = Key
    )
    val mapKeys = capital.keys
    val mapValues = capital.values

    println(capital.getValue("Jakarta"))
    println(mapKeys)
    println(mapValues)
    println("------------------------------")

    val namaNamaNegara = mapOf(
        "Asia" to listOf("Indonesia", "Malaysia", "Singapura"),
        "Eropa" to listOf("Inggris", "Prancis", "Jerman")
    )
    println("Nama negara yang termasuk ke dalam Asia adalah ${namaNamaNegara["Asia"]}")
    println("Nama negara yang termasuk ke dalam Eropa adalah ${namaNamaNegara["Eropa"]}")
}