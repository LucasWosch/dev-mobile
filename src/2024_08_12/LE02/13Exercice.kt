package `2024_08_12`.LE02

import kotlin.math.round

fun main() {
    print("Informe a quantidade de números do Fibonacci: ")
    println("Sequência Fibonacci: " + fibonacci(readln().toInt()))
}

fun fibonacci(n: Int): MutableList<Int>{
    val fibonacci: MutableList<Int> = mutableListOf()
    for(number in 0..<n){
        fibonacci.add(
            if(fibonacci.lastIndex <= 0) 1
            else
            fibonacci.last() +
                if(fibonacci.lastIndex - 1 <= 0) 1 else
            fibonacci[fibonacci.lastIndex - 1
            ]
        )
    }
    return fibonacci
}