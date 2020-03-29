package structural.composite

class Thing(private val cost: Int) : Item {

    override fun getCost(): Int = cost

}