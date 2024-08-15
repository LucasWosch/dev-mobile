package `2024_08_12`.LE02

fun main(args: Array<String>) {
    val numbers : MutableList<Int> = mutableListOf()
    for(numero in 1..5) {
        print("Digite o número $numero: ")
        numbers.add(readln().toInt())
    }
    print("Digite o número N: ")
    val nNumber = readln().toInt()
    println("Quantidade de vezes que o número $nNumber: " + numbers.count{it == nNumber})
}