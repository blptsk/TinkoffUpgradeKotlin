package intensive_2.highOrderedFuctions

val sum = { a: Double, b: Double -> a + b }
val subtraction = { a: Double, b: Double -> a - b }

fun main() {
    println(calculator(getCalculationMethod("+"), 2.0, 3.0))
    calculator(getCalculationMethod("-"), 2.0, 13.0)
}

fun calculator(lambda : ((Double, Double)-> Double), a: Double, b: Double ) {
    println(lambda(a,b))
}

fun getCalculationMethod(name: String) :(Double, Double)-> Double {
    return when (name) {
        "+" -> sum
        "-" -> subtraction
        else -> throw UnsupportedOperationException()
    }
}