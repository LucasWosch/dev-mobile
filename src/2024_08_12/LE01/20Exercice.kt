package `2024_08_12`.LE01
import kotlin.math.round

fun main() {
    print("Informe o consumo médio de litro por hora: ")
    val fuelRange = readln().toDouble()
    print("Informe a velocidade média Km/h: ")
    val speedAverage = readln().toDouble()
    print("Informe a duração da viagem: ")
    val hours = readln().toDouble()
    println("Quantidade combústivel gasta: " + round(fuelConsumption(fuelRange, speedAverage, hours) * 100) / 100.0 + "L")
}

fun fuelConsumption(fuelRange: Double, speedAverage: Double, hours: Double): Double {
    return (speedAverage * hours) / fuelRange
}
