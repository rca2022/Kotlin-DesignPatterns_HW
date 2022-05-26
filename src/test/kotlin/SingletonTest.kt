import behavioral.singleton.SingletonClass
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {

    @Test
    fun checkID(){
        val singleTonObj = SingletonClass.instance
        singleTonObj?.id = "Sample"

        assertEquals("Sample", singleTonObj!!.id)
    }

}