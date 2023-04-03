package intensive_1.objects

class Cafe {
    companion object MyCompanion{
        const val LATTE = "latte"

        fun getLatteFromClass() {
           // println(name)
        }
    }
    val name = "DrinkIt"
    fun bestBeverage() = LATTE

}


fun main() {
    println(Cafe.LATTE)
    println(Cafe.MyCompanion.LATTE)
    println(Cafe().bestBeverage())
}