package intensive_2.collections.sort.comparator

import intensive_2.collections.sort.Person

class MyComparatorByWeight: Comparator<Person> {
    override fun compare(o1: Person, o2: Person): Int {
        return o1.weight.compareTo(o2.weight)
    }
}

class MyComparatorByAge: Comparator<Person> {
    override fun compare(o1: Person, o2: Person): Int {
        return o1.age.compareTo(o2.age)
    }
}