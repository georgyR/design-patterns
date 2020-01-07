package abstract_factory.implementation

import abstract_factory.base.Checkbox

class WindowsCheckbox: Checkbox {
    override fun render() {
        println("render Windows checkbox")
    }
}