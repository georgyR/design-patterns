package builder.components

enum class Engine(val hoursPower: Int) {
    ECONOMIC(120),
    SPORT(420);

    override fun toString() = "power: $hoursPower hp"

}