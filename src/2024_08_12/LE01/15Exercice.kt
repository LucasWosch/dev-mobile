package `2024_08_12`.LE01
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    print("Informe o valor de X do ponto 1: ")
    val ponto1: MutableList<Double> = mutableListOf(readln().toDouble())
    print("Informe o valor de Y do ponto 1: ")
    ponto1[0] += readln().toDouble()
    print("Informe o valor de X do ponto 2: ")
    val ponto2: MutableList<Double> = mutableListOf(readln().toDouble())
    print("Informe o valor de Y do ponto 2: ")
    ponto2 += readln().toDouble()
    try {
        println("Distância: " + round(distanceOfP1andP2(ponto1, ponto2) * 100) / 100.0)
    }
    catch (e: Exception) {
        println(e.message)
    }
}

fun distanceOfP1andP2(p1: List<Double>, p2: List<Double>): Double {
    return sqrt(Math.pow(p2[0] - p1[0],2.0) + Math.pow(p2[1] - p1[1], 2.0))
}