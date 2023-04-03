package intensive_1.vararg

fun main() {
    println(sum(1, 2 ,3 ,4 ,5 ))
}

fun sum(vararg params: Int) : Int {
    var sum : Int = 0
    params.forEach {
        sum+=it
    }
    return sum
}

