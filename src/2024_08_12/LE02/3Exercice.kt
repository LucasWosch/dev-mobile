package `2024_08_12`.LE02


fun main(args: Array<String>) {
    val numbers : MutableList<Double> = mutableListOf()
    val doubledNumbers : MutableList<Double> = mutableListOf()
    while(true) {
        print("Digite um número: ")
        var input = readln()
        try{numbers.add(input.toDouble())} catch (e: Exception){break}
    }
    numbers.forEach { number -> doubledNumbers.add(number * 2) }
    println("Números digitados: ${numbers.joinToString()}")
    println("Dobro dos números digitados: ${doubledNumbers.joinToString()}")
}




