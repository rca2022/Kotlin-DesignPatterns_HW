import behavioral.builder.Form
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderTest {
    val builder = Form.FormBuilder("FirstName", "LastName")

    @Test
    fun checkFirstName(){
        assertEquals("FirstName", builder.build().firstName)
    }

    @Test
    fun checkLastName(){
        assertEquals("LastName", builder.build().lastName)
    }

    @Test
    fun checkAddress(){
        builder.addAddress("address")
        assertEquals("address", builder.build().address)
    }
}