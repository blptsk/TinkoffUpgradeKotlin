package intensive_2.generics

abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name), Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

class Fish(name: String) : Pet(name) ,Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

interface Runnable {
    fun run()
}