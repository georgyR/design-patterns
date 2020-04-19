package structural.proxy

interface FactsAboutCatsApi {
    fun getFactList(): List<FactAboutCatInfo>
    fun getFact(id: String): String
}