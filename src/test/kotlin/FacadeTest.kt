import structural.facade.ShopFacade
import org.junit.jupiter.api.Test
import structural.facade.Item
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals


class FacadeTest {
    private val shop = ShopFacade()
    private val item1 = Item("Item 1", 5.00, 30)
    private val item2 = Item("Item 2", 4.00, 0)

    @Test
    fun addItemTest(){
        assertEquals(shop.addItem(item1), "Added ${item1.name}")
    }

    @Test
    fun wrongAddedItemTest(){
        assertNotEquals(shop.addItem(item2), "Added ${item1.name}")
    }

    @Test
    fun itemNoNameTest(){
        val item3 = Item("", 4.00, 20)
        assertEquals(shop.addItem(item3), "Please input name of item.")
    }

    @Test
    fun checkoutTest(){
        shop.addItem(item1)
        assertEquals(shop.checkout(), "Reserved ${item1.name}")
    }

    @Test
    fun checkoutNotAvailableTest(){
        shop.addItem(item2)
        assertEquals(shop.checkout(), "${item2.name} is not available")
    }

    @Test
    fun payTest(){
        shop.addItem(item1)
        assertEquals(shop.pay(), 168.00)
    }

    @Test
    fun zeroPayTest(){
        shop.addItem(item2)
        assertEquals(shop.pay(), 0.00)
    }

    @Test
    fun deliverTest(){
        shop.addItem(item1)
        assertEquals(shop.deliver(),
            "Retrieve package of ${item1.name} Assign package of ${item1.name} ")
    }
}