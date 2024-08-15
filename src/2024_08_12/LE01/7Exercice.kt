package `2024_08_12`.LE01
fun main()
{
    print("Digite um número: ")
    between100and200(readln().toInt())
}

fun between100and200(number: Int) {
    if(number in 100..200) println("O número está entre 100 e 200") else println("O número não está entre 100 e 200")
}