package behavioral.chain_of_responsibility.item.base

abstract class Container(name: String, helpText: String?) : Component(name, helpText) {

    private val componentList = mutableListOf<Component>()

    fun add(component: Component) {
        componentList.add(component)
        component.setParent(this)
    }

}