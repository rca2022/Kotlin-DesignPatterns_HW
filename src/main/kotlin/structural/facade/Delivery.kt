package structural.facade

class Delivery {
    fun retrievePackage(item: Item) = "Retrieve package of ${item.name} "
    fun assignPackage(item: Item) = "Assign package of ${item.name} "
}