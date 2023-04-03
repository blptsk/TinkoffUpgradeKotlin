package intensive_1.infix


val map2 = mapOf(1.to("one"), 2.to("two"), 5.to("five"))

val map = mapOf(1 to "one", 3 to "three", 9 to "nine")

infix fun Int.plus(value: Int) :Int {
    return this + value
}

fun main() {
    println( 2 plus 3 )
}