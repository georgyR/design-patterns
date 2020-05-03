package behavioral.chain_of_responsibility

import behavioral.chain_of_responsibility.item.Button
import behavioral.chain_of_responsibility.item.Dialog
import behavioral.chain_of_responsibility.item.Panel

fun main() {
    val okButton = Button("Ok")
    val cancelButton = Button("Cancel")

    val panel = Panel("Main panel")
    panel.apply {
        add(okButton)
        add(cancelButton)
    }

    val dialog = Dialog("Main dialog", "Super useful info for user")
    dialog.add(panel)

    okButton.showHelp()
}