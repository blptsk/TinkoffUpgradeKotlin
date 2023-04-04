package intensive_2.collections

val listOfInt = listOf(1,4,6,1,3,6,23,5,238)
val listOfNullableInt: List<String> = listOf("12", "21s", "23d")

fun main() {
    println(listOfNullableInt)
    println(
        listOfNullableInt.mapNotNull {
            it.toIntOrNull()
        }
    )
}