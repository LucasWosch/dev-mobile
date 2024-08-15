package `2024_08_12`.LE01
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val notas: MutableList<Double> = mutableListOf()
    for(n in 1..3){
        print("Informe a Nota $n: ")
        notas += readln().toDouble()
    }
    println("Média harmônica: " + round(harmonicAverage(notas) * 100) / 100.0)
}

fun harmonicAverage(numeros: List<Double>): Double {
    var total: Double = 0.0
    numeros.forEach { numero ->  total += 1 / numero}.also { return  numeros.size / total }
}
