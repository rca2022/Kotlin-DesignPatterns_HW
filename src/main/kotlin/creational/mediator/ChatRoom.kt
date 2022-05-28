package creational.mediator

import java.util.*

class Chatroom {
    companion object {
        fun showMessage(user: User, message : String) =
            if (user.toString().isEmpty()){
                "Please input name"
            }
            else{
                "${Date()} [${user}] : ${message}"
            }
    }
}