package behavioral.command

import java.util.*

class EditorHistory {

    private val commandStack = Stack<Command>()

    fun push(command: Command) {
        commandStack.push(command)
    }

    fun pop(): Command? = if (commandStack.isNotEmpty()) commandStack.pop() else null

}