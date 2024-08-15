package `2024_08_12`.LE01
fun main() {
    print("Informe o número A: ")
    var numeroA = readln().toInt()
    print("Informe o número B: ")
    compareNumbers(numeroA, readln().toInt())
}

fun compareNumbers(numeroA: Int, numeroB: Int) {
    when (numeroA) {
        numeroB -> println("Os números são iguais")
        in 0..numeroB -> println("Os número são diferentes e o número maior é o número B: $numeroB")
        else -> println("Os número são diferentes e o número maior é o número A: $numeroA")
    }
}