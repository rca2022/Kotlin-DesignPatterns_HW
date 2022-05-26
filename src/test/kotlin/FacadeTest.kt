import structural.facade.ShopFacade
import org.junit.jupiter.api.Test
import structural.facade.Item
import kotlin.test.assertEquals


class FacadeTest {
    private val shop = ShopFacade()
    private val item1 = Item("Item 1", 5.00, 30)

    @Test
    fun addItemTest(){
        assertEquals(shop.addItem(item1), "Added ${item1.name}")
    }

    @Test
    fun checkoutTest(){
        shop.addItem(item1)
        assertEquals(shop.checkout(), "Reserved ${item1.name}")
    }

    @Test
    fun payTest(){
        shop.addItem(item1)
        assertEquals(shop.pay(), 168.00)
    }

    @Test
    fun deliverTest(){
        shop.addItem(item1)
        assertEquals(shop.deliver(),
            "Retrieve package of ${item1.name} Assign package of ${item1.name} ")
    }
}