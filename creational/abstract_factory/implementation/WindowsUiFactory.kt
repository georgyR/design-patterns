package creational.abstract_factory.implementation

import creational.abstract_factory.base.Button
import creational.abstract_factory.base.Checkbox
import creational.abstract_factory.base.UiFactory

class WindowsUiFactory: UiFactory {

    override fun createButton(): Button = WindowsButton()

    override fun createCheckBox(): Checkbox = WindowsCheckbox()

}