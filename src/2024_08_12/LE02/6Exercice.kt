package `2024_08_12`.LE02

import kotlin.math.round

fun main() {
    val notas: MutableList<Double> = mutableListOf()
    val peso: MutableList<Double> = mutableListOf()

    print("Informe a quantidade de Notas: ")

    for(n in 1..readln().toInt()){
        print("Informe a Nota $n: ")
        notas += readln().toDouble()
        print("Informe o Peso da Nota $n: ")
        peso += readln().toDouble()
    }
    println("Média Ponderada: " + round(weightedAverage(notas, peso) * 100) / 100.0)
}

fun weightedAverage(numeros: List<Double>, peso: List<Double>): Double {
    return sumWeightedNumbers(numeros,peso) / peso.sum()
}

fun sumWeightedNumbers(numeros: List<Double>, peso: List<Double>): Double {
    var total : Double = 0.0
    numeros.forEachIndexed { index, numero ->  total += numero * peso[index]}.also { return total }
}