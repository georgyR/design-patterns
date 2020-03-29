package structural.decorator

class StringDataSource : DataSource {

    companion object {
        private const val DEFAULT_VALUE = "DEFAULT_VALUE"
    }

    private var data: String = DEFAULT_VALUE


    override fun writeData(data: String) {
        this.data = data
        println("write string:$data")
    }

    override fun readData(): String {
        println("read string:$data")
        return data
    }

}