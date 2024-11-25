package cuenta

class Cuenta {
    var  Titular: String?=""
    var Cantidad : Float = 0F

    constructor(Titular: String, Cantidad: Float) {
        this.Titular = Titular
        if(Cantidad<0){
            this.Cantidad=0F
        }else{
            this.Cantidad = Cantidad
        }
    }

    constructor(Titular: String) {
        this.Titular = Titular
    }

    fun ingresar(CantidadA:Float):Float{
        if(CantidadA>0){
            Cantidad= Cantidad+CantidadA
        }
        return Cantidad
    }

    fun retirar(CantidadA: Float):Float{
        if(Cantidad<CantidadA){
            Cantidad=0F
        }else{
            Cantidad=Cantidad-CantidadA
        }
        return Cantidad
    }

    override fun toString(): String {
        return "Titular: $Titular, Cantidad: $Cantidad"
    }



}