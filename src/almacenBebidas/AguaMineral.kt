package almacenBebidas

class AguaMineral(
    id:Int,
    litros:Double,
    precio:Double,
    marca:String,
    val origen:String

):Bebida(id,litros,precio,marca)
