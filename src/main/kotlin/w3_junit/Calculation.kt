package w3_junit

class Calculation {

    val addition : (Double, Double) -> Double =  { _,_ ->Double.NaN}
    val subtraction : (Double, Double) -> Double =  { _,_ ->Double.NaN}
    val multiplication : (Double, Double) -> Double = { _,_ ->Double.NaN}
    val division : (Double, Double) -> Double = { _,_ ->Double.NaN}

    fun calculator(lambda: ((Double, Double) -> Double), a: Double, b: Double): Double {
        return lambda(a, b)
    }
}

