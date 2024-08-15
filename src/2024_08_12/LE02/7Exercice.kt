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
    if(vetores[0].equals(vetores[1])) println("Vetores iguais") else println("Vetores diferentes")
}
