package behavioral.singleton

class SingletonClass private constructor(){
    var id : String = ""

    companion object {
        val instance = SingletonClass()
    }
}