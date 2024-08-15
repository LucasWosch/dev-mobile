package `2024_08_12`.LE01

fun main()
{
    print("Informe a temperatura em Celsius: ")
    println("A temperatura em Fahrenheit é: " + celsiusToFahrenheit(readln().toDouble()) + "°F")
}

fun celsiusToFahrenheit(c: Double): Double {
    return (9 * c + 160) / 5
}