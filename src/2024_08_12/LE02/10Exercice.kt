package `2024_08_12`.LE02

import kotlin.math.round

fun main() {
    val vetores = mutableListOf<MutableList<Int>>()
    val vetoresReserva = mutableListOf<MutableList<Int>>()

    for(countVetor in 0..1){
        println("Valores vetor $countVetor")
        val vetor: MutableList<Int> = mutableListOf()
        for(number in 0..4){
            print("Informe o valor $number: ")
            vetor.add(readln().toInt())
        }
        vetores.add(vetor)
        vetoresReserva.add(vetor)
    }
        vetores[0] = vetoresReserva[1].reversed().toMutableList()
        vetores[1] = vetoresReserva[0].reversed().toMutableList()

    println("Vetor A antes: " + vetoresReserva[0].toString())
    println("Vetor B antes: " + vetoresReserva[1].toString())
    println("Vetor A depois: " + vetores[0].toString())
    println("Vetor B depois: " + vetores[1].toString())
}
