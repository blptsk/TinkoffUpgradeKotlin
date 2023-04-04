package intensive_2.collections.sort

fun main() {
    val personList = listOf(
        Person("Billy", 30,90),
        Person("Oleg", 13,50),
        Person("Van", 45,140),
        Person("Alex", 41,60)
    )

    println(personList.sortedBy { it.weight })
    println(personList.sortedBy { it.age })

    var items = listOf(1,2,3,4,5)

    items
        .asSequence()
        .filter { it > 20}
        .map { it + 10 }
        .take (2)
        .toList()

    Person("1",2,3) + Person("1",2,3)
}

private operator fun Person.plus(person: Person): Person =
    Person("${name} ${person.name}",
        age + person.age,
        weight + person.weight )