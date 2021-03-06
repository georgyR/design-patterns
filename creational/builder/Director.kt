package creational.builder

import creational.builder.components.Engine
import creational.builder.components.Powertrain
import creational.builder.components.Transmission

object Director {
    fun buildFamilyCar() = Car.Builder()
        .engine(Engine.ECONOMIC)
        .transmission(Transmission.AUTOMATIC)
        .powertrain(Powertrain.FRONT_WHEEL)
        .seatsNumber(4)
        .build()

    fun buildSportCar() = Car.Builder()
        .engine(Engine.SPORT)
        .transmission(Transmission.MANUAL)
        .powertrain(Powertrain.REAR_WHEEL)
        .seatsNumber(2)
        .build()
}