package behavioral.singleton

class SingletonClass {
    var id : String = ""

    companion object {
        val instance = SingletonClass()
    }
}