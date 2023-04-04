package intensive_2.collections

fun main() {
    val items = listOf<Int>()
    println(items.fold(10) {sum, item -> sum * item})
}