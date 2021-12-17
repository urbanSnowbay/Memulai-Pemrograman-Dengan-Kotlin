package kotlinGenerics

abstract class Vehicle(wheel: Int)

class Car(speed: Int) : Vehicle(4)
class Motorcycle(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    val motorcycle = Motorcycle(100)
    var vehicle: Vehicle = car
    vehicle = motorcycle

    var carList = listOf(Car(100), Car(120))
    val vehicleList = carList
}

// -----Covariant-----
interface Urutan<out E> : Collection<E> {
    operator fun get(index: Int): E
}

// -----Contravariant-----
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}
