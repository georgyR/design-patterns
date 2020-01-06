package factory_method.implementation

import factory_method.base.TitleBar

class MacOsTitleBar: TitleBar {

    override fun render() {
        println("[ o o o                ]")
    }

}