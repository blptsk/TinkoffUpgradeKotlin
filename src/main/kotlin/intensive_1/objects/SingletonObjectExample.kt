package intensive_1.objects

object DataBaseWriter {
    val database = Database()

    fun write(info: String) {
        database.write(info)
    }
}

fun main() {
    DataBaseWriter.write("Барсик")
    DataBaseWriter.write("Мурзик")
    DataBaseWriter.write("Борис Аркадьевич")
}

class Database {
    fun write(info: String){}
    fun read(){}
}