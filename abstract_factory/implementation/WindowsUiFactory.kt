package abstract_factory.implementation

import abstract_factory.base.Button
import abstract_factory.base.Checkbox
import abstract_factory.base.UiFactory

class WindowsUiFactory: UiFactory {

    override fun createButton(): Button = WindowsButton()

    override fun createCheckBox(): Checkbox = WindowsCheckbox()

}