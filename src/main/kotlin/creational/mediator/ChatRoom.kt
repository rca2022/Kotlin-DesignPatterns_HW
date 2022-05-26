package creational.mediator

import java.util.*

object ChatRoom {
    fun showMessage(user: User, message: String) {
        println(Date().toString() + " [ " + user.name + "] : " + message)
    }
}