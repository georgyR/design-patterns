package structural.flyweight

fun main() {
    val forest = Forest().apply {
        addTree(0,0, Color.GREEN, 10)
        addTree(0, 1, Color.ORANGE, 5)
        addTree(0, 2,  Color.RED, 3)
        addTree(1, 0, Color.YELLOW, 1)
        addTree(1, 1, Color.GREEN, 9)
        addTree(1, 2,  Color.RED, 3)
        addTree(1, 2,  Color.RED, 3)
        addTree(2, 0, Color.YELLOW, 1)
        addTree(2, 1, Color.YELLOW, 1)
        addTree(2, 2, Color.GREEN, 9)
    }

    forest.draw()
}