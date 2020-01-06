package factory_method.implementation

import factory_method.base.Dialog
import factory_method.base.TitleBar

class Application {

    fun render() {

        val windowsDialog = object : Dialog() {
            override fun createTitleBar(): TitleBar = WindowsTitleBar()
        }

        val macOsDialog = object : Dialog() {
            override fun createTitleBar(): TitleBar = MacOsTitleBar()
        }

        windowsDialog.render()
        macOsDialog.render()
    }

}