package structural.flyweight

object TreeTypeFactory {

    private val mutableSet = mutableSetOf<TreeType>()

    fun getTreeType(color: Color, height: Int): TreeType {
        val existedTreeType = mutableSet.find { it.color == color && it.height == height }
        return if (existedTreeType != null) {
            existedTreeType
        } else {
            val newTreeType = TreeType(color, height)
            mutableSet.add(newTreeType)
            newTreeType
        }
    }

}