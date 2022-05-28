import creational.mediator.User
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

class MediatorTest {
    val robert = User("Robert")
    val john = User("John")

    @Test
    fun checkChatRoomUser(){
        assertEquals("${robert}", "Robert")
        assertEquals("${john}", "John")
    }

    @Test
    fun checkNoName(){
        val noName = User("")
        val noNameMSG = noName.sendMessage("")
        assertEquals("Please input name", noNameMSG)
    }

    @Test
    fun hiMessageTest(){
        val message = robert.sendMessage("Hi John!")
        assertEquals("${Date()} [${robert}] : Hi John!", message)
    }

    @Test
    fun helloMessageTest(){
        val message = john.sendMessage("Hello Robert!")
        assertEquals("${Date()} [${john}] : Hello Robert!", message)
    }

    @Test
    fun blankMessageTest(){
        val message = robert.sendMessage("")
        assertEquals("${Date()} [${robert}] : ", message)
    }

}