package objectOrientedProgramming
import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti Getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue ")
        value = newValue
    }
}

class Binatangg {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
    val binatang = Binatangg()
    binatang.name = "Kucing Haiqal"
    binatang.weight = 6.2
    binatang.age = 4

    println("Nama: ${binatang.name}")
    println("Berat: ${binatang.weight} kg")
    println("Umur: ${binatang.age} tahun")
}