package behavioral.command

fun main() {
    Editor().apply {
        add("iOS")
        print()

        clear()
        add("Android is operating system")
        add(" based on a modified version of the Linux kernel and other open source software")
        print()

        replace("operating system", "mobile OS")
        print()

        remove(31)
        print()

        clear()
        print()

        undo()
        print()
    }
}