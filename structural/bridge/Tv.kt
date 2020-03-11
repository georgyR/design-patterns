package structural.bridge

class Tv: Device {

    private var enable = false
    private var volume = 10
    private var currentChannel = 1

    override fun isEnabled(): Boolean = enable

    override fun enable() {
        enable = true
        println("TV was enabled")
    }

    override fun disable() {
       enable = false
        println("TV was disable")
    }

    override fun getVolume(): Int = volume

    override fun setVolume(percent: Int) {
        volume = when {
            percent > 100 -> 100
            percent < 0 -> 0
            else -> percent
        }
        println("volume: $volume")
    }

    override fun getChannel(): Int = currentChannel

    override fun setChannel(channel: Int) {
        currentChannel = when {
            channel > 50 -> 1
            channel < 1 -> 50
            else -> channel
        }
        println("turn to channel $channel")

    }

}