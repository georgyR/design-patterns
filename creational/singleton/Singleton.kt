package creational.singleton

class Singleton private constructor() {

    companion object {
        private lateinit var instance: Singleton

        fun getInstance(): Singleton {
            if (::instance.isInitialized.not()) instance = Singleton()

            return instance
        }
    }

    fun doSomething() {
        println("do something")
    }

}