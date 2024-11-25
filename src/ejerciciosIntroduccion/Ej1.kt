package ejerciciosIntroduccion

/**
 *Escribe un programa que escriba exactamente las notificaciones de tu movil
 * cuando sea menor de 100 y que escriba que tienes +99 notificacioes sino
 */

fun main(){
    val morningNotification= 51
    val eveningNotification= 135

    printNotification(morningNotification)
    printNotification(eveningNotification)
}

fun printNotification(numberMessage:Int){
    if(numberMessage>99){
        println("You have +99 messages")
    }else{
        println("You have $numberMessage messages")

    }
}