package cuenta

    fun main(){
        val cuenta1 = Cuenta("Patricia")
        val cuenta2 = Cuenta("Juan", 1754.2f)
        println("Cuenta 1 = $cuenta1")
        println("Cuenta 2 = $cuenta2")
        cuenta1.ingresar(200f)
        cuenta2.retirar(350f)
        cuenta2.retirar(2500f)
        println("Cuenta 1 = $cuenta1")
        println("Cuenta 2 = $cuenta2")
    }
