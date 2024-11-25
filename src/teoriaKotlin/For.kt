package teoriaKotlin

fun main(){
    for(i in 1..5){
        println("Contando $i")
    }
    for (i in 1..5) println("Contando $i")

    // iteración regular
    for (char in 'a'..'f') print(char)

    // iteración con avance de 2
    println()
    for (char in 'a'..'f' step 2) print(char)

    println()
    // iteración en reversa
    for (char in 'f' downTo 'a') print(char)

    // iteración excluyendo el límite superior
    println()
    for (char in 'a' until 'f') print(char)

    val champions = arrayOf("Teemo", "Ahri", "Vayne", "Brand", "Kindred")

    for (i in champions.indices) {
        println("[$i, ${champions[i]}]")
    }

    // Desestructuración de elementos de Array
    for ((i, v) in champions.withIndex()) {
        println("[$i, $v]")
    }

    for(c in "Develou"){
        println(c)
    }
}