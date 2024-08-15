package `2024_08_12`.LE01
fun main() {
    print("Informe o primeiro número: ")
    val numeroA = readln().toInt()
    print("Informe o segundo número: ")
    val numeroB = readln().toInt()
    print("Informe o terceiro número: ")
    sortNumbers(listOf(numeroA, numeroB, readln().toInt())).forEach { print("$it ") }
}

fun sortNumbers(numeros: List<Int>): List<Int> {
    return numeros.sorted()
}