package intensive_2.lambdas


val yourNameIsLambda = { name: String, surname: String ->
    "Вас зовут " + name + " " + surname
}

val stringJoiner = { name: String, surname: String ->
    name  + surname
}

fun main() {
    myAwesomeFunc(stringJoiner, "Alex", "Palex")
}


fun myAwesomeFunc(lambda : ((String, String)-> String), name: String, surname: String ) {
    println(lambda(name,surname))
}