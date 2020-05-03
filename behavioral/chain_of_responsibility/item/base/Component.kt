package behavioral.chain_of_responsibility.item.base


abstract class Component(private val name: String, private val helpText: String?): ItemWithContextHelp {

    private var parent: Container? = null

    override fun showHelp() {
        if (helpText != null) {
            println("$name: $helpText")
        } else {
            parent?.showHelp()
        }
    }

    fun setParent(container: Container) {
        parent = container
    }

}