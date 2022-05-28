import behavioral.builder.Form
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class BuilderTest {
    private val builder = Form.FormBuilder("Juan", "Cruz")
    private val builder2 = Form.FormBuilder("", "")

    @Test
    fun checkNotNull(){
        assertNotNull(builder.build())
    }

    @Test
    fun checkFirstName(){
        assertEquals("Juan", builder.build().firstName)
    }

    @Test
    fun checkLastName(){
        assertEquals("Cruz", builder.build().lastName)
    }

    @Test
    fun checkAddress(){
        builder.addAddress("San Juan")
        assertEquals("San Juan", builder.build().address)
    }

    @Test
    fun checkNoAddress(){
        assertEquals("", builder.build().address)
    }

    @Test
    fun checkNoFirstName(){
        assertEquals("", builder2.build().firstName)
    }

    @Test
    fun checkNoLastName(){
        assertEquals("", builder2.build().lastName)
    }
}