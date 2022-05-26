package structural.facade

class Delivery {
    fun retrievePackage(item: Item) = "Retrieved ${item.itemName} "
    fun assignPackage(item: Item) = "Assigned ${item.itemName} "
}