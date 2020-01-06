package factory_method.implementation

import factory_method.base.TitleBar

class WindowsTitleBar: TitleBar {

    override fun render() {
        println("[ Application    _ □ x ]")
    }

}