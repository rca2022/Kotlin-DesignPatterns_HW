import creational.iterator.NameRepository
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IteratorTest {
    @Test
    fun checkNamesTest() {
        val nameRepository = NameRepository()
        val iterator = nameRepository.getIterator()
        var names = ""

        while (iterator.hasNext()){
            names += "${iterator.next()}, "
        }

        assertEquals("Robert, John, Julie, Lora, ", names)
    }

}