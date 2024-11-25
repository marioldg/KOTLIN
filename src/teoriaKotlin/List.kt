package teoriaKotlin

fun main(){
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(3,"DiaAñadido")
    println(weekDays)

    if(weekDays.isEmpty()){
        //No voy a pintar nada porque no hay
    }else{
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    weekDays.last()

    for(pp in weekDays){

    }

    weekDays.forEach {  }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())//ultima posicion de un list
    println(readOnly.first())//primera posicion de un list

//    Filtrar
    val example = readOnly.filter { it.contains("a")  }
    println(example)

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }//si quiero cambiar la variable por defecto it se hace asi
}