package creational.abstract_factory.implementation

import creational.abstract_factory.base.Checkbox

class WindowsCheckbox: Checkbox {
    override fun render() {
        println("render Windows checkbox")
    }
}