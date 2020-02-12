package creational.abstract_factory

import creational.abstract_factory.base.UiFactory
import creational.abstract_factory.implementation.MacOsUiFactory
import creational.abstract_factory.implementation.WindowsUiFactory

fun main() {
    val macOsFactory: UiFactory = MacOsUiFactory()
    macOsFactory.createButton().render()
    macOsFactory.createCheckBox().render()

    val windowsFactory: UiFactory = WindowsUiFactory()
    windowsFactory.createButton().render()
    windowsFactory.createCheckBox().render()
}