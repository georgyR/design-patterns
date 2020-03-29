package structural.decorator

import kotlin.experimental.xor

class EncryptionDataSourceDecorator(dataSource: DataSource) : DataSourceDecorator(dataSource) {

    companion object {
        private const val KEY: Byte = 88
    }


    override fun writeData(data: String) {
        val byteArray = data.toByteArray().map { it xor KEY }.toByteArray()
        val encryptedData = String(byteArray)
        println("string was encrypted: $data -> $encryptedData")
        super.writeData(encryptedData)
    }

    override fun readData(): String {
        val data = super.readData()
        val byteArray = data.toByteArray().map { it xor KEY }.toByteArray()
        val decryptedData = String(byteArray)
        println("string was decrypted: $data -> $decryptedData")
        return String(byteArray)
    }

}