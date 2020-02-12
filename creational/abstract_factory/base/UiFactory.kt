package creational.abstract_factory.base

interface UiFactory {
    fun createButton(): Button
    fun createCheckBox(): Checkbox
}