package `2024_08_12`.LE02


fun main(args: Array<String>) {
    val numbers : MutableList<Double> = mutableListOf()
    while(true) {
        print("Digite um número: ")
        var input = readln()
        try{numbers.add(input.toDouble())} catch (e: Exception){break}
    }
    numbers.forEachIndexed { index, number -> println(" Posição $index do vetor: $number é ${statusNumber(number)}") }
}

fun statusNumber(number : Double) : String{
    when{
        number > 0 -> return "positivo"
        number < 0 -> return "negativo"
        else -> return "zero"
    }
}



