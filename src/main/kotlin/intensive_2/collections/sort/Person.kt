package intensive_2.collections.sort

data class Person (val name: String, var age: Int, var weight: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.weight.compareTo(other.weight)
    }
}
