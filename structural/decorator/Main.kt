package structural.decorator

fun main() {
    println("Simple DataSource:")
    StringDataSource().writeAndRead("design pattern")

    println("\nEncryption DataSource:")
    EncryptionDataSourceDecorator(StringDataSource()).writeAndRead("design pattern")
}

private fun DataSource.writeAndRead(data: String) {
    writeData(data)
    readData()
}