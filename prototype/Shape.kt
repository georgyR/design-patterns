package prototype

//This implementation has only educational purpose because Kotlin has the built-in feature: data class and fun copy()
abstract class Shape(
    protected open val x: Int,
    protected open val y: Int,
    protected open val color: String
) {

    abstract fun clone(): Shape

}