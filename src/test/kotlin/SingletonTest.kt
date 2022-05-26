import behavioral.singleton.SingletonClass
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {

    @Test
    fun sameInstanceTest(){
        val singleTonObj = SingletonClass.instance
        val singleTonObj2 = SingletonClass.instance
        assertEquals(singleTonObj, singleTonObj2)
    }

    @Test
    fun sameIdTest(){
        val singleTonObj = SingletonClass.instance
        singleTonObj.id = "Sample"

        val singleTonObj2 = SingletonClass.instance
        assertEquals(singleTonObj.id, singleTonObj2.id)
    }

}