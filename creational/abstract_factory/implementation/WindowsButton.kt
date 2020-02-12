package creational.abstract_factory.implementation

import creational.abstract_factory.base.Button

class WindowsButton: Button {
    override fun render() {
        println("render Windows button")
    }
}