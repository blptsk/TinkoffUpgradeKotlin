package week3_junit

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import w3_junit.UserValidator

/**
 * Дополнительный пример
 *
 * Представим что мы хотим проверить валидацию некоего поля
 * Для этого сформируем набор данных из Имени, Фамилии, Возраста и Валидности данных
 *
 * По бизнес логикe:
 *  1. Если возраст более 25, то валидация не проходит
 *  2. Если в фамилии менее 3 символов, то валидация не проходит
 *  3. Если в имени более 20 символов, то валидация не проходит
 *
 */
@RunWith(Parameterized::class)
class UserValidationParameterizedTest(
    private val name: String,
    private val surname: String,
    private val age: Int,
    private val expectedValidity: Boolean,
) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        // чтобы передать набор параметров разного типа, стоит указать тип Array<Any> в качестве списка параметров
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("Leonardo", "Dicaprio", 26, false),
                arrayOf("Vasiliy", "Pupkin", 12, true),
                arrayOf("Ivan-Stepan-Bul-Bul-Ogly", "Sidorov", 21, false),
                arrayOf("Nikolay", "A", 10, false),
                arrayOf("Nikolay", "Antonov", 10, true),
                arrayOf("Nikolay", "Antonov", 70, false),
            )
        }
    }

    @Test
    fun additionTest() {
        assertEquals(
            "validation error!", expectedValidity, UserValidator.isUserDataValid(name, surname, age)
        )
    }
}