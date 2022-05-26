package structural.facade

class Warehouse {
    fun isAvailable(item: Item) = item.stock > 0
    fun reserveItem(item: Item) = "Reserved ${item.name}"
}