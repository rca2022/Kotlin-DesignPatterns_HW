package creational.mediator

import java.util.*

class Chatroom {
    companion object {
        fun showMessage(user: User, message : String) =
            "${Date()} [${user}] : ${message}"
    }
}