package teoriaKotlin

fun main(){
    var miFunctionSuma = fun (x: Int, y: Int) : Int = x + y
    var miFuncionMultiplicar = fun(x: Int, y: Int) : Int = x * y
    var resSuma = miFunctionSuma(1,2)
    var resMult = miFuncionMultiplicar(13,2)
    println(resSuma)
    println(resMult)
}