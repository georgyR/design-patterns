package creational.factory_method.implementation

import creational.factory_method.base.Dialog
import creational.factory_method.base.TitleBar

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