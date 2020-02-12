package creational.abstract_factory.implementation

import creational.abstract_factory.base.Button

class MacOsButton: Button {
    override fun render() {
        println("render MacOs button")
    }
}