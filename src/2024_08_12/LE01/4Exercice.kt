package `2024_08_12`.LE01

fun main()
{
    print("Informe o número A: ")
    var numeroA = readln().toInt()
    print("Informe o número B: ")
    allMathFunctions(numeroA, readln().toInt())
}


fun allMathFunctions(numeroA: Int, numeroB: Int){
    println("Soma: $numeroA + $numeroB = " + plusNumbers(numeroA, numeroB))
    println("Subtração: $numeroA - $numeroB = " + subNumbers(numeroA, numeroB))
    println("Multiplicação: $numeroA * $numeroB = " + multiplyNumbers(numeroA, numeroB))
    println("Divisão: $numeroA / $numeroB = " + divideNumbers(numeroA, numeroB))
}

fun plusNumbers(numeroA: Int, numeroB: Int): Int {
    return numeroA + numeroB
}

fun subNumbers(numeroA: Int, numeroB: Int): Int {
    return numeroA - numeroB
}

fun multiplyNumbers(numeroA: Int, numeroB: Int): Int {
    return numeroA * numeroB
}

fun divideNumbers(numeroA: Int, numeroB: Int): Int {
    return numeroA / numeroB
}