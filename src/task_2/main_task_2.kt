package task_2

import java.io.BufferedReader
import java.io.File

fun main(args: Array<String>) {

    val bufferedReader: BufferedReader = File("src\\task_2\\book.txt").bufferedReader()
    var inputString = bufferedReader.use { it.readText() }.toLowerCase()

    var wordsList: List<String> = inputString.split(" ").map { it.trim() }
    wordsList = wordsList.filterNot { it.equals("a") || it.equals("the") }


    var sorWordsList: Map<String, Int> = wordsList.groupingBy { it }.eachCount().filter { it.value > 1 }


    val sList = sorWordsList.toList()
        .sortedBy { (key, value) -> value }
        .toMap()

    var i = 0
    var find = sList.size - 10
    for ((key, value) in sList) {
        if (i >= find) {
            println(String.format("The word | %4s | appears | %4d | times in text", key, value))
        }
        i++
    }
}

