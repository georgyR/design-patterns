package structural.adapter

fun main() {
    val roundHole = RoundHole(12.0)

    val roundPeg = RoundPeg(10.0)
    println("round peg is fit: ${roundHole.fits(roundPeg)}")

    val squarePeg = SquarePeg(15)
    println("square peg is fit: ${roundHole.fits(RoundPegAdapter(squarePeg))}")
}