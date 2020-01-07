package abstract_factory.implementation

import abstract_factory.base.Checkbox

class MacOsCheckbox: Checkbox {
    override fun render() {
        println("render MacOs checkbox")
    }
}