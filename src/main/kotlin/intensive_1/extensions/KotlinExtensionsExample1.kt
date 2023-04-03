package intensive_1.extensions

fun Int.square(): Int {
    return this * this
}

fun main() {
    val myValue = 12
    println(myValue.square())
}