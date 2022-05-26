package structural.facade

class Billing {
    fun getPayableAmount(item: Item) : Double = (item.price * item.stock) + getTax(item)
    fun getTax(item: Item) : Double = item.price * .12 * item.stock
}