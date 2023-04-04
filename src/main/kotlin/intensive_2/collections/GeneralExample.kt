package intensive_2.collections

data class GeneralPerson (var name: String, var age: Int, var weight: Int)

fun main() {
    val listOfInt = listOf(33,5,24,11,22,29)

    println(
        listOfInt
            .asSequence()
            .filter { it > 20 }
            .map { it + 10 }
            .take(2)
            .toList()
    )
}