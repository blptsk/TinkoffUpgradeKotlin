package intensive_1.extensions

class MyFinalClass(private val name: String, val surName: String) {
    //some code
}

fun MyFinalClass.printNameAndSurname() {
    println("Имя $surName")
   // println("Имя и фамилия - $name $surName") - не будет работать, т.к. name - приватное поле
}


fun main() {
    MyFinalClass("Van", "Darkholm").printNameAndSurname()


}

