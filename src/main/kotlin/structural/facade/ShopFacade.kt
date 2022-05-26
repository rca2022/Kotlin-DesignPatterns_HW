package structural.facade

class ShopFacade {
    private var billing: Billing = Billing()
    private var delivery: Delivery = Delivery()
    private var warehouse: Warehouse = Warehouse()
    private var item: Item? = null

    fun addItem(item: Item) : String{
        this.item = item
        return "Added ${item.itemName}"
    }

    fun checkItem() : String{
        return if (warehouse.isAvailable(this.item!!)) warehouse.reserveItem(this.item!!)
        else "${this.item!!.itemName} unavailable"
    }

    fun checkPrice() : Double {
        return billing.getPayableAmount(this.item!!)
    }

    fun checkDelivery() : String {
        return delivery.retrievePackage(this.item!!) + delivery.assignPackage(this.item!!)
    }

}