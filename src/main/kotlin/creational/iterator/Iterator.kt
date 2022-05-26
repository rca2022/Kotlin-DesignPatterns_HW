package creational.iterator

interface Iterator {
    operator fun hasNext(): Boolean
    operator fun next(): Any
}