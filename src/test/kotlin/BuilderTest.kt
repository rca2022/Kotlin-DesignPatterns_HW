import behavioral.builder.Form
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderTest {
    private val builder = Form.FormBuilder("Juan", "Cruz")

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
}