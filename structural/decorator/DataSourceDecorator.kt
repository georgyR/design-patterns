package structural.decorator

abstract class DataSourceDecorator(private val dataSource: DataSource) : DataSource {

    override fun writeData(data: String): Unit = dataSource.writeData(data)

    override fun readData(): String = dataSource.readData()

}