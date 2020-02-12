package creational.factory_method.implementation

import creational.factory_method.base.TitleBar

class MacOsTitleBar: TitleBar {

    override fun render() {
        println("[ o o o                ]")
    }

}