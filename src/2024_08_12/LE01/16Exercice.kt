package `2024_08_12`.LE01
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val notas: MutableList<Double> = mutableListOf()
    for(n in 1..3){
        print("Informe a Nota $n: ")
        notas += readln().toDouble()
    }
    println("Média: " + round(averageNumbers(notas) * 100) / 100.0)
}

fun averageNumbers(numeros: List<Double>): Double {
    return numeros.sum() / numeros.size
}