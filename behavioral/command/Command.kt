package behavioral.command

sealed class Command(private val editor: Editor) {
    private val backup = editor.textField

    abstract fun execute(): Boolean

    fun undo() {
        editor.textField = backup
    }
}

class AddCommand(private val text: String, private val editor: Editor) : Command(editor) {
    override fun execute(): Boolean {
        editor.textField = editor.textField + text
        return true
    }
}

class RemoveCommand(private val removedCharCount: Int, private val editor: Editor) : Command(editor) {
    override fun execute(): Boolean {
        editor.textField = editor.textField.dropLast(removedCharCount)
        return true
    }
}

class ReplaceCommand(
    private val oldString: String,
    private val newString: String,
    private val editor: Editor
) : Command(editor) {
    override fun execute(): Boolean {
        editor.textField = editor.textField.replace(oldString, newString)
        return true
    }
}

class ClearCommand(private val editor: Editor) : Command(editor) {
    override fun execute(): Boolean {
        editor.textField = ""
        return true
    }
}

class PrintCommand(private val editor: Editor) : Command(editor) {
    override fun execute(): Boolean {
        val text = if (editor.textField.isEmpty()) "EMPTY" else editor.textField
        println(text)
        return false
    }
}