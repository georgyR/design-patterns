package builder

import builder.components.Engine
import builder.components.Powertrain
import builder.components.Transmission

data class Car(
    val engine: Engine,
    val transmission: Transmission,
    val powertrain: Powertrain,
    val seatsNumber: Int
) {

    override fun toString(): String = """
            $engine
            $transmission
            $powertrain
            number of seats: $seatsNumber
        """.trimIndent()

    //This implementation has only educational purpose because Kotlin has the built-in feature Type-Safe Builders
    class Builder {
        private var engine: Engine? = null
        private var transmission: Transmission? = null
        private var powertrain: Powertrain? = null
        private var seatsNumber: Int? = null

        fun engine(engine: Engine) = apply { this.engine = engine }
        fun transmission(transmission: Transmission) = apply { this.transmission = transmission }
        fun powertrain(powertrain: Powertrain) = apply { this.powertrain = powertrain }
        fun seatsNumber(number: Int) = apply { this.seatsNumber = number }

        fun build() = Car(
            engine ?: Engine.ECONOMIC,
            transmission ?: Transmission.MANUAL,
            powertrain ?: Powertrain.FRONT_WHEEL,
            seatsNumber ?: 1
        )
    }
}