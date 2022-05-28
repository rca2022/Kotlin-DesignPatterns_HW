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

    @Test
    fun checkTotalNamesTest() {
        val nameRepository = NameRepository()
        val iterator = nameRepository.getIterator()

        assertEquals(4, iterator.getTotal())
    }

    @Test
    fun checkHasNextTest() {
        val nameRepository = NameRepository()
        val iterator = nameRepository.getIterator()

        assertEquals(true, iterator.hasNext())
    }

    @Test
    fun checkNextTest() {
        val nameRepository = NameRepository()
        val iterator = nameRepository.getIterator()

        assertEquals("Robert", iterator.next())
    }

    @Test
    fun checkNoNextTest() {
        val nameRepository = NameRepository()
        val iterator = nameRepository.getIterator()
        var names = ""

        while (iterator.hasNext()){
            names += "${iterator.next()}, "
        }

        assertEquals("", iterator.next())
    }

}