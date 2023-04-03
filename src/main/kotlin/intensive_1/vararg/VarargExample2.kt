package intensive_1.vararg

fun main() {
    val list = intArrayOf(1, 2, 3, 4, 5)
    val list2 = intArrayOf(1, 2, 3, 4, 5)
    println( sumExample( 1,2,3,4,5 ))
    println( sumExample( *list , *list2) )
}

fun sumExample(vararg params: Int) : Int {
    var sum : Int = 0
    params.forEach {
        sum+=it
    }
    return sum
}

fun sumShort(vararg params: Int) : Int = params.sum()