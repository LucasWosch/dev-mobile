package `2024_08_12`.LE01
fun main() {
    print("Informe um número de 1 a 5: ")
    print("Você digitou " + getNumberName1to5(readln().toInt()))
}

fun getNumberName1to5(number: Int): String {
    val numberNames = listOf("UM", "DOIS", "TRÊS", "QUATRO", "CINCO")
    if (number in 1.. numberNames.size) return numberNames[number-1].toString() else return "Número inválido"
}