package creational.builder.components

enum class Powertrain {
    FRONT_WHEEL,
    REAR_WHEEL;

    override fun toString(): String {
        val abbreviation = when (this) {
            FRONT_WHEEL -> "FWD"
            REAR_WHEEL -> "RWD"
        }
        return "powertrain: $abbreviation"
    }
}