package structural.adapter

class RoundHole(private val radius: Double) {

    fun fits(peg: RoundPeg): Boolean = (peg.radius <= radius)

}