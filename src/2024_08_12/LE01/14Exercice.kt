package `2024_08_12`.LE01
fun main() {
    print("Informe o valor de A1: ")
    val numeroA1 : Double = readln().toDouble()
    print("Informe o valor de N: ")
    val numeroN : Double = readln().toDouble()
    print("Informe o valor de R: ")
    try {
        println("Resultado: " + arithmeticProgression(numeroA1,numeroN, readln().toDouble()))
    }
    catch (e: Exception) {
        println(e.message)
    }
}

fun arithmeticProgression( a1: Double,n: Double, r: Double): Double {
    return a1 + (n - 1) * r
}