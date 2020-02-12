package creational.abstract_factory.implementation

import creational.abstract_factory.base.Checkbox

class MacOsCheckbox: Checkbox {
    override fun render() {
        println("render MacOs checkbox")
    }
}