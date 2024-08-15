package `2024_08_12`

import java.util.*

fun main() {
    val NAME = "Kotlin"

    println("Hello, ${NAME}!")
    var somaTotal = 0
    var numeroUsuario: Int = 0;



    for (i in 0..4) {
        numeroUsuario = readln().toInt()
        somaTotal += numeroUsuario

    }

    val media = somaTotal / 5
    when(media){
        in 1..50 -> println("Entre 1 e 50")
        else -> println("Menor que 1 ou Maior que 50")
    }
    println(media)
    var myList = mutableListOf("1", "2", 3)
    myList.remove(3)

    val numbers = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(4,5,6)
    val combined = numbers2 + numbers
    println(combined.contentToString())

    var numberOfBooks: Int? = null
    numberOfBooks = 6
    if (numberOfBooks != null) {
        numberOfBooks = numberOfBooks.dec()
        println(numberOfBooks)
    }
    numberOfBooks = 6
    numberOfBooks = numberOfBooks?.dec()
    println(numberOfBooks)
}