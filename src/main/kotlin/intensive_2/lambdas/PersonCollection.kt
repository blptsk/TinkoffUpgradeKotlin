package intensive_2.lambdas

data class Person(val name: String, val age: Int)

val people = listOf(
        Person("Alice", 29),
        Person("Billy", 31),
        Person("Van", 34),
        Person("Heisenberg", 51)
    )


fun main() {
    println(people.maxBy { it.age })
}

fun printProblemCounts(responses : Collection<String>) {

    var errors = 0
    responses.forEach {
        if (it.contains("Error")) {
            errors++
        }
    }
}
