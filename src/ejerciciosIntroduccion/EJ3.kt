package ejerciciosIntroduccion

/**
 * En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa
que convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se
usa para convertir un número en un tipo String con 2 decimales.
 */


fun main() {
println(conversion())
}

fun conversion(){
        println("Introduce la temperatura:")
        val temperatura = readLine()?.toDoubleOrNull() ?: return println("Temperatura no válida.")

        println("Escala actual (C, F, K):")
        val origen = readLine()?.uppercase() ?: return println("Escala no válida.")

        println("Escala a convertir (C, F, K):")
        val destino = readLine()?.uppercase() ?: return println("Escala no válida.")

        val resultado =
            if (origen == "C" && destino == "F") (9.0 / 5.0) * temperatura + 32
            else if (origen == "C" && destino == "K") temperatura + 273.15
            else if (origen == "F" && destino == "C") (5.0 / 9.0) * (temperatura - 32)
            else if (origen == "F" && destino == "K") (5.0 / 9.0) * (temperatura - 32) + 273.15
            else if (origen == "K" && destino == "C") temperatura - 273.15
            else if (origen == "K" && destino == "F") (9.0 / 5.0) * (temperatura - 273.15) + 32
            else return println("Conversión no válida.")

        println("El resultado es: ${"%.2f".format(resultado)}")
    }
