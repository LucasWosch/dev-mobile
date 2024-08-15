package `2024_08_12`.LE02

import kotlin.math.round

fun main() {
    val vetor: MutableList<Int> = mutableListOf()
    for(number in 0..4){
        print("Informe o valor $number: ")
        vetor.add(readln().toInt())
    }
    vetor.forEachIndexed({index, valor -> println("$index ${vetor.max()}")})
//    println("O produto dos números é: " + vetor.reduce { count, number -> count - number })
}

