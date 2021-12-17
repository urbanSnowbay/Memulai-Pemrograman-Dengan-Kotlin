package objectOrientedProgramming
import kotlin.reflect.KProperty

class delegateName {
    private var value: String = "Default"
    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animall {
    var name: String by delegateName()
}

class Person {
    var name: String by delegateName()
}

class Hero {
    var name: String by delegateName()
}

fun main() {
    val animal = Animall()
    animal.name = "Meong Haiqal"
    println("Nama hewan: ${animal.name}")

    val person = Person()
    person.name = "Haiqal"
    println("Nama orang: ${person.name}")

    val hero = Hero()
    hero.name = "Wiro Sableng"
    println("Nama pahlawan: ${hero.name}")
}