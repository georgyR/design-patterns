package creational.prototype


data class Rectangle(
    override val x: Int,
    override val y: Int,
    override val color: String,
    private val width: Int,
    private val height: Int
) : Shape(x, y, color) {

    override fun clone() = Rectangle(x, y, color, width, height)

}