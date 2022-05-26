import structural.facade.ShopFacade
import org.junit.jupiter.api.Test
import structural.facade.Item
import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.assertEquals


class FacadeTest {
    val shop = ShopFacade()
    var item = Item("Item 1", 599.0, 3)

    @Test
    fun checkFacade(){
        shop.checkDelivery()
    }

    @Test
    fun checkItem(){
        assertEquals(shop.checkItem(), "Reserved ${item.itemName}")
    }

    @Test
    fun checkAddItem(){
        assertEquals(shop.addItem(item), "Added ${item.itemName}")
    }

    @Test
    fun checkPrice(){
        assertEquals(shop.checkPrice(), 599.0)
    }

    @Test
    fun checkDelivery(){
        assertEquals(shop.checkDelivery(), "Retrieved ${item.itemName} Assigned ${item.itemName} ")
    }
}