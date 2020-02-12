package creational.factory_method.base

abstract class Dialog {

    abstract fun createTitleBar(): TitleBar

    fun render() {
        val titleBar = createTitleBar()
        titleBar.render()
    }

}