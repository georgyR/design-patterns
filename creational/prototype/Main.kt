package creational.prototype

fun main() {
    val rectangle = Rectangle(x = 10, y = 10, color = "red", width = 30, height = 20)
    val rectanglePrototype = rectangle.clone()

    println("rectangle and creational.prototype  equal - ${rectangle == rectanglePrototype}")
    println("rectangle and creational.prototype have several instance - ${rectangle === rectanglePrototype}")

    val circle = Circle(x = 10, y = 10, color = "red", radius = 20)
    val circlePrototype = circle.clone()

    println("rectangle and creational.prototype  equal - ${circle == circlePrototype}")
    println("rectangle and creational.prototype have several instance - ${circle === circlePrototype}")
}