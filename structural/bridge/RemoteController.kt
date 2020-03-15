package structural.bridge

// abstraction
class RemoteController(private val device: Device) {

    fun togglePower() {
        if (device.isEnabled()) device.disable() else device.enable()
    }

    fun volumeDown() {
        device.apply {
            setVolume(getVolume() - 5)
        }
    }

    fun volumeUp() {
        device.apply {
            setVolume(getVolume() + 5)
        }
    }

    fun channelDown() {
        device.apply {
            setChannel(getChannel() - 1)
        }
    }

    fun channelUp() {
        device.apply {
            setChannel(getChannel() + 1)
        }
    }

}