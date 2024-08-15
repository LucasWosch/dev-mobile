package `2024_08_12`.LE01
fun main() {
    print("Informe o número do mês: ")
    print(getMonthName(readln().toInt()))
}

fun getMonthName(number: Int): String {
    val numberNames = listOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro")
    if (number in 1.. numberNames.size) return "Você digitou o mês de " + numberNames[number-1].toString() else return "Mês inválido"
}