package `2024_08_12`.LE01

fun main()
{
    var numeroAReserva: Int
    var numeroBReserva: Int

    print("Informe o número A: ")
    var numeroA = readln().toInt().also {numeroAReserva = it }
    print("Informe o número B: ")
    var numeroB = readln().toInt().also {numeroBReserva = it }
    numeroA = numeroBReserva.also{numeroB = numeroAReserva}
    println("Valor original número A: $numeroAReserva")
    println("Valor original número B: $numeroBReserva")
    println("Valor final número A: $numeroA")
    println("Valor final número B: $numeroB")
}

