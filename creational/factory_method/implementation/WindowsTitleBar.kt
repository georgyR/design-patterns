package creational.factory_method.implementation

import creational.factory_method.base.TitleBar

class WindowsTitleBar: TitleBar {

    override fun render() {
        println("[ Application    _ □ x ]")
    }

}