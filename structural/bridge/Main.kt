package structural.bridge

fun main() {
    val remoteController = RemoteController(device = Tv())

    remoteController.apply {
        togglePower()

        volumeDown()
        volumeDown()

        volumeUp()
        volumeUp()

        channelUp()
        channelDown()
        channelDown()
        channelDown()

        togglePower()
    }
}