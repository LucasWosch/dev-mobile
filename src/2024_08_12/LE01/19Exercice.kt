package `2024_08_12`.LE01
import kotlin.math.round

fun main() {
    print("Informe o raio do cilindro: ")
    val radius = readln().toDouble()
    print("Informe a altura do cilindro: ")
    val height = readln().toDouble()
    println("Volumne: " + round(vol(radius, height) * 100) / 100.0)
}

fun vol(radius: Double, height: Double): Double {
    return 3.14 * Math.pow(radius, 2.0) * height
}
