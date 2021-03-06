package creational.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
    fun getTotal(): Int
}