package structural.facade

class Billing {
    fun getPayableAmount(item: Item) : Double {
        val subTotal = item.amount * item.stock
        return subTotal.addWithTax(subTotal)
    }

    infix fun Double.addWithTax(subTotal: Double) = subTotal + (subTotal * .12)
}