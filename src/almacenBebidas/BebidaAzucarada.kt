package almacenBebidas

class BebidaAzucarada(
    id:Int,
    litros:Double,
    precio:Double,
    marca:String,
    val porcentajeAzucar:Double,
    val promocion:Boolean
):Bebida(id, litros,precio,marca) {
    val precioConDescuento: Double
        get() = if (promocion) precio * 0.9 else precio


}