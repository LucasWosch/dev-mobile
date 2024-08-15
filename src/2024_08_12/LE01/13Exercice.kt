package `2024_08_12`.LE01
fun main() {
    print("Informe o número A: ")
    val numeroA : Double = readln().toDouble()
    print("Informe o número B: ")
    val numeroB : Double = readln().toDouble()
    print("Digite o caracter da operação desejada: ")
    try {
        println("Resultado: " + makeOperation(listOf(numeroA,numeroB), readln().first()))
    }
    catch (e: Exception) {
        println(e.message)
    }
}

fun makeOperation( numeros: List<Double>, operation: Char): Double {
        when(operation) {
            '+' -> return numeros[0] + numeros[1]
            '-' -> return numeros[0] - numeros[1]
            '*' -> return numeros[0] * numeros[1]
            '/' -> if(numeros[1] == 0.0) throw error("Não é possível realizar divisão por zero") else return numeros[0] / numeros[1]
            else -> throw error("Operação não encontrada")
        }
}