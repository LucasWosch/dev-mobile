package `2024_08_12`.LE01

fun main()
{
    print("Informe o número A: ")
    var numeroA = readln().toInt()
    print("Informe o número B: ")
    verifyHighest(numeroA, readln().toInt())
}


fun verifyHighest(numeroA: Int, numeroB: Int) {
    when (numeroA) {
        numeroB -> println("A sequência de números informados é invalida")
        in 0..numeroB -> println("O número maior é o número B: $numeroB")
        else -> println("O número maior é o número A: $numeroA")
    }
}