package structural.proxy

import java.lang.IllegalArgumentException

class FactsAboutCatsServer : FactsAboutCatsApi {

    override fun getFactList(): List<FactAboutCatInfo> {
        simulateServerLoadingDelay()
        return listOf(
            FactAboutCatInfo(
                id = "0001",
                name = "History"
            ),
            FactAboutCatInfo(
                id = "0002",
                name = "About cat routine"
            ),
            FactAboutCatInfo(
                id = "0003",
                name = "How long live"
            )
        )
    }

    override fun getFact(id: String): String {
        simulateServerLoadingDelay()
        return when (id) {
            "0001" -> "The oldest known pet cat existed 9,500 years ago"
            "0002" -> "Cats spend between 30 to 50 percent of their day grooming themselves"
            "0003" -> " The world's oldest living cat is 31 years old"
            else -> throw IllegalArgumentException()
        }
    }

    private fun simulateServerLoadingDelay() {
        print("loading ")
        for (i in 1..3) {
            Thread.sleep(1000)
            print("$i..")
        }
        println()
    }

}