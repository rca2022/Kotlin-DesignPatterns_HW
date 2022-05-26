package creational.iterator

class NameRepository : Container {
    var names = arrayOf("Robert", "John", "Julie", "Lora")

    private inner class NameIterator : Iterator {
        var index = 0

        override fun hasNext(): Boolean {
            return index < names.size
        }

        override fun next(): String {
            return if (hasNext()) {
                names[index++]
            } else ""
        }
    }


    override fun getIterator(): Iterator {
        return NameIterator()
    }
}