package creational.mediator

class User(var name: String) {
    fun sendMessage(message : String) = Chatroom.showMessage(this, message)

    override fun toString(): String {
        return name
    }

}