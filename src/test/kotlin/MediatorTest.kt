import creational.mediator.User
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MediatorTest {
    val robert = User("Robert")
    val john = User("John")

    @Test
    fun checkChatRoomUsers(){
        assertEquals("${robert}", "Robert")
        assertEquals("${john}", "John")
    }

    @Test
    fun checkMessages(){
        val robert = User("Robert")
        val john = User("John")

        val message1 = robert.sendMessage("Hi! John!")
        val message2 = robert.sendMessage("Hi! Robert!")


    }


}