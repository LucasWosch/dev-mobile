package `2024_08_12`.LE02

import kotlin.math.round

fun main() {
    val vetor: MutableList<Int> = mutableListOf()
    for(number in 0..11){
        print("Informe o valor $number: ")
        var digitedNumber = readln().toInt()
        if(digitedNumber > 0 && digitedNumber % 2 == 0) vetor.add(digitedNumber)
    }
    println("O produto dos números é: " + vetor.reduce { count, number -> count - number })
}

