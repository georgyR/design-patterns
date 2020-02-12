package creational.abstract_factory.implementation

import creational.abstract_factory.base.Button
import creational.abstract_factory.base.Checkbox
import creational.abstract_factory.base.UiFactory

class MacOsUiFactory: UiFactory {

    override fun createButton(): Button = MacOsButton()

    override fun createCheckBox(): Checkbox = MacOsCheckbox()

}