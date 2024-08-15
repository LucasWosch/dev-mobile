package `2024_08_12`.LE02

val equalNumbers : MutableList<Double> = mutableListOf()
val lowestNumbers : MutableList<Double> = mutableListOf()
val highestNumbers : MutableList<Double> = mutableListOf()

fun main(args: Array<String>) {
    val numbers : MutableList<Double> = mutableListOf()
    for (time in 1..5){
        print("Digite o número $time: ")
        numbers.add(readln().toDouble())
    }
    println("Média dos números: ${numbers.average()}")
    loopingAverageNumbers(numbers)

    println("Números menores que a média: ${lowestNumbers.toString()}")
    println("Números iguais a média: ${equalNumbers.toString()}")
    println("Números maiores que média: ${highestNumbers.toString()}")
}

fun loopingAverageNumbers(numbers: List<Double>){
    numbers.forEach { number -> compareAverageNumbers(number, numbers.average())}
}
fun compareAverageNumbers(number: Double, average:Double){
    when{
        number == average -> equalNumbers.add(number)
        number < average -> lowestNumbers.add(number)
        else -> highestNumbers.add(number)
    }
}