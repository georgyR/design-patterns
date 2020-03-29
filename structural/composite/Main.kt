package structural.composite

fun main() {
    val bigBox = Box(
        Thing(100),
        Thing(50),
        Thing(30),
        Thing(80),
        Box(
            Thing(100),
            Thing(50),
            Thing(30),
            Thing(80),
            Box(
                Thing(100),
                Thing(50),
                Thing(30),
                Thing(80)
            )
        ),
        Thing(100),
        Thing(50),
        Thing(30),
        Thing(80)
    )

    println("total cost of things in the big box is ${bigBox.getCost()}")

}