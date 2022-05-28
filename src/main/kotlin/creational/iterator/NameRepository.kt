package creational.iterator

class NameRepository : Container {
    var names = arrayOf("Robert", "John", "Julie", "Lora")

    override fun getIterator(): Iterator {
        return NameIterator()
    }

    private inner class NameIterator : Iterator {
        var index : Int = 0

        override fun hasNext(): Boolean {
            return index < names.size
        }

        override fun next(): String {
            if (this.hasNext()){
                return names[index++]
            }
            return ""
        }

        override fun getTotal(): Int {
            return names.size
        }
    }
}