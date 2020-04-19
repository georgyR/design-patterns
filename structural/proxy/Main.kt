package structural.proxy

fun main() {
    CachedFactsAboutCatsServer(FactsAboutCatsServer()).apply {
        val firstFactId = getFactList().first().id
        println(getFactList())
        println(getFact(firstFactId))
        println(getFact(firstFactId))

        val secondFactId = getFactList()[2].id
        println(getFactList())
        println(getFact(secondFactId))
        println(getFact(secondFactId))
    }
}