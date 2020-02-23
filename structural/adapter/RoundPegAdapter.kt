package structural.adapter

import kotlin.math.sqrt

class RoundPegAdapter(squarePeg: SquarePeg) : RoundPeg(widthToRadius(squarePeg.width)) {

    companion object {
        private fun widthToRadius(width: Int): Double = width * sqrt(2.0) / 2
    }

}