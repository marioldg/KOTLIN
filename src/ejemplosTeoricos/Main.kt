package ejemplosTeoricos

fun main(){

    val mapa = mapOf("Alice" to 30, "Bob" to 25, "Charlie" to 35)


    array()
    arrayList()
    println( crearMapa())
    println("Cantidad de elementos: ${contarElementos(mapa)}")
    println("Edad de Alice: ${obtenerValor(mapa, "Alice")}") // 30
    println("Edad de Dan: ${obtenerValorConDefecto(mapa, "Dan", 0)}")
    println("¿Contiene la clave 'Bob'? ${contieneClave(mapa, "Bob")}")
    println("¿Contiene el valor 25? ${contieneValor(mapa, 25)}")


}


fun array(){
    /*DECLARACION ARRAY TAMAÑO CONCRETO*/

    val semana= arrayOf("Lunes","Martes","Miercoles")
    println(semana[0])
    println(semana.get(1))
}

fun arrayList(){
    /*LISTAS MUTABLES O ARRAYSLIST:
    * LA FUNCION AddAll JUNTA DOS LISTAS*/

    val diasSemana: MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes")
    val diasFinde : MutableList<String> = mutableListOf("Sabado","Domingo")

    println(diasSemana)
    diasSemana.addAll(diasFinde)
    println(diasSemana)

}
/* CREA UN MAPA Y ASOCIA INT(EDADES)
** A STRINGS(NOMBRES) */

fun crearMapa(): Map<String, Int> {
    return mapOf("Alice" to 30, "Bob" to 25, "Charlie" to 35) // Crea un mapa con nombres y edades.
}

/* DEVUELVE NºTOTAL DE ELEMENTOS*/

fun contarElementos(map: Map<String, Int>): Int {
    return map.count()
}

/*OBTIENE EL VALOR DE LA CLAVE ESPECIFICA DEL MAPA Y
**LANZA UNA EXCEPCION SI NO EXISTE.*/

fun obtenerValor(map: Map<String, Int>, clave: String): Int {
    return map.getValue(clave) // Obtiene el valor asociado a 'clave'.
}

/*OBTIENE UN VALOR ESPECIFICO O ASOCIA UNO POR DEFECTO
**SI  NO EXISTE */

fun obtenerValorConDefecto(map: Map<String, Int>, clave: String, valorPorDefecto: Int): Int {
    return map.getOrDefault(clave, valorPorDefecto) // Devuelve el valor de 'clave' o 'valorPorDefecto' si no existe.
}

/*COMPRUEBA SI UNA CLAVE ESTA EN EL MAPA*/

fun contieneClave(map: Map<String, Int>, clave: String): Boolean {
    return map.containsKey(clave) // Devuelve true si 'clave' está en el mapa, false en caso contrario.
}

// COMPRUEBA SI UN VALOR ESTA EN EL MAPA
fun contieneValor(map: Map<String, Int>, valor: Int): Boolean {
    return map.containsValue(valor) // Devuelve true si 'valor' está en el mapa, false en caso contrario.
}

