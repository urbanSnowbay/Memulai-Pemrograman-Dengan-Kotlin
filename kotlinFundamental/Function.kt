fun main() {
    /*Alur logikanya adalah
    fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
}
     */

    //Tentukan terlebih dahulu functionName nya
    val user = setUser("Haiqal", 20)
    println(user)
    //

    printUser("Haiqal")
}

    //Kemudian, type tersebut di-return
    fun setUser(name: String, age: Int) = "Nama anda adalah $name, umur anda adalah $age"
    //

    fun printUser(name: String) {
    println("Nama anda adalah $name")
}