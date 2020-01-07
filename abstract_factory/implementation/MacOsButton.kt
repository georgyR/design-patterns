package abstract_factory.implementation

import abstract_factory.base.Button

class MacOsButton: Button {
    override fun render() {
        println("render MacOs button")
    }
}