package structural.flyweight

data class Tree(val x: Int, val y: Int, val type: TreeType) {

    fun draw(): String = "x=$x,y=$y ${type.color.name} ${type.height}m tree (typeHashCode = ${type.hashCode()})"

}