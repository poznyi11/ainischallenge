package task_1.task_1_1

class MaxLengthEven {
    fun maxLengthEven() {
        val listStart = mutableListOf("121233", "DFf", "88888888", "FWDF5", "f")
        val listFind = listStart.filter { it.length % 2 == 0 }.sortedBy { it.length }
        val findText = listFind.getOrNull(listFind.lastIndex) ?: "Не найдено"
        println(findText)
    }
}