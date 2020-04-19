package structural.proxy

class CachedFactsAboutCatsServer(private val server: FactsAboutCatsApi) : FactsAboutCatsApi {

    private var factList = emptyList<FactAboutCatInfo>()
    private val factMap = mutableMapOf<String, String>()

    override fun getFactList(): List<FactAboutCatInfo> {
        if (factList.isEmpty()) {
            factList = server.getFactList()
        }
        return factList
    }

    override fun getFact(id: String) = factMap.getOrPut(id) { server.getFact(id) }

}