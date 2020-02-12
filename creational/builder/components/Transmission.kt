package creational.builder.components

enum class Transmission {

    MANUAL,
    AUTOMATIC;

    override fun toString() = "transmission: ${name.toLowerCase()}"

}