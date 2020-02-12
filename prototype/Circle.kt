package prototype


data class Circle(
    override val x: Int,
    override val y: Int,
    override val color: String,
    private val radius: Int
) : Shape(x, y, color) {

    override fun clone(): Shape = Circle(x, y, color, radius)

}