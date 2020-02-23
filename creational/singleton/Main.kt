package creational.singleton

fun main() {
    val first = Singleton.getInstance()
    first.doSomething()

    val second = Singleton.getInstance()

    if (first === second) println("Singleton has only one instance")
}