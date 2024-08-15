package `2024_08_12`.LE02

import kotlin.math.round

fun main() {
    val vetores = mutableListOf<MutableList<Int>>()

    for(countVetor in 0..1){
        println("Valores vetor $countVetor")
        val vetor: MutableList<Int> = mutableListOf()
        for(number in 0..4){
            print("Informe o valor $number: ")
            vetor.add(readln().toInt())
        }
        vetores.add(vetor)
    }
    vetores.add(mutableListOf())
    for(number in 0..<vetores[0].size){
        vetores.last().add(if(number % 2 == 0) vetores[0][number] else vetores[1][number])
    }
    println("Vetor 3: " + vetores[2].toString())
}
