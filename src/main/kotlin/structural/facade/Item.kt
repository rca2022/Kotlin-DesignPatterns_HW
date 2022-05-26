package structural.facade

class Item(itemName: String, price: Double, stock: Int) {
    var itemName : String = "Item 1"
    var price : Double = 0.0
    var stock : Int = 0

    init {
        this.itemName = itemName
        this.price = price
        this.stock = stock
    }


}