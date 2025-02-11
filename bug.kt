fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 3) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 2, 3]
}