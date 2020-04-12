package structural.flyweight

class Forest {

    private val treeList = mutableListOf<Tree>()

    fun addTree(x: Int, y: Int, color: Color, height: Int) {
        val treeType = TreeTypeFactory.getTreeType(color, height)
        val tree = Tree(x, y, treeType)
        treeList.add(tree)
    }

    fun draw() {
        treeList.forEach {
            println(it.draw())
        }
    }
}