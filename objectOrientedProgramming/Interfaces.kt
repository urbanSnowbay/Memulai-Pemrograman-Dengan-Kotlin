package objectOrientedProgramming

interface Ifly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : Ifly {

    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm flying without wings")
    }
}