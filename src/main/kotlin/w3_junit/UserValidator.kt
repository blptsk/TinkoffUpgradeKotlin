package w3_junit

class UserValidator {
    companion object {
        fun isUserDataValid(name: String, surname: String, age: Int) :Boolean = ( age < 25 && name.length < 20 && surname.length > 2)
    }
}