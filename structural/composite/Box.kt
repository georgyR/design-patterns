package structural.composite

class Box(vararg item: Item) : Item {

    private val items: List<Item> = item.toList()

    override fun getCost(): Int {
        return items.sumBy { it.getCost() }
    }

}