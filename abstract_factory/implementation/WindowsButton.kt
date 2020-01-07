package abstract_factory.implementation

import abstract_factory.base.Button

class WindowsButton: Button {
    override fun render() {
        println("render Windows button")
    }
}