package behavioral.command

class Editor {

    var textField: String = ""

    private val history = EditorHistory()


    fun add(text: String): Unit = executeCommand(AddCommand(text, this))

    fun remove(removeCharCount: Int): Unit = executeCommand(RemoveCommand(removeCharCount, this))

    fun replace(oldString: String, newString: String): Unit = executeCommand(ReplaceCommand(oldString, newString, this))

    fun print(): Unit = executeCommand(PrintCommand(this))

    fun clear(): Unit = executeCommand(ClearCommand(this))

    fun undo() {
        val command = history.pop()
        command?.undo()
    }


    private fun executeCommand(command: Command) {
        val shouldAddToHistory = command.execute()
        if (shouldAddToHistory) history.push(command)
    }

}