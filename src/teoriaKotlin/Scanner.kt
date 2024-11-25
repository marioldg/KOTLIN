package teoriaKotlin

import java.util.Scanner

fun main(){

    //inicializo Scaner
    val scanner = Scanner(System.`in`)


    //leo una linea e imprimo
    val line= scanner.nextLine()
    print(line)

    //leo la primera palabra e imprimo
    val string = scanner.next()
    print(string)

    //leo entero e imprimo
    val num= scanner.nextInt()
    print(num)
}