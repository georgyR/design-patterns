package abstract_factory.implementation

import abstract_factory.base.Button
import abstract_factory.base.Checkbox
import abstract_factory.base.UiFactory

class MacOsUiFactory: UiFactory {

    override fun createButton(): Button = MacOsButton()

    override fun createCheckBox(): Checkbox = MacOsCheckbox()

}