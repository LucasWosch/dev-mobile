package `2024_08_12`.LE02


fun main(args: Array<String>) {
    val numbers : MutableList<Int> = mutableListOf()
    for(numero in 0..4) {
        print("Digite o número $numero: ")
        numbers.add(readln().toInt())
    }
    print("Digite o número N: ")
    val nNumber = readln().toInt()
    print("Números menores: ").also {  numbers.forEachIndexed { index, number -> if(number < nNumber) print(" ${index}°")}}
}
