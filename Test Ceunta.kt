import java.util.function.DoubleBinaryOperator

fun main(){
    println("Desea abrir su cuenta con o sin dinero? 1: sin dinero 2: con dinero")
    val TipoCuenta: String? = readLine()
    if(TipoCuenta == "1") {
        println("Ingrese su Nombre")
        val Nombre: String? = readLine()
        val miCuenta = Cuenta(Nombre!!)
        loop@ do {
            println("Que operacion quiere realzar?")
            println("1.- Depositar")
            println("2.- Retirar")
            println("3.- Consultar saldo")
            println("4.- Salir")
            val opcion:String? = readLine()
            when (opcion) {
                "1" -> {
                    var num  = ObtenerDinero()
                    var result  = miCuenta.Ingresar(num)
                    println(result)
                }
                "2"-> {
                    var num = RetirarDinero()
                    var result = miCuenta.Retirar(num)
                    println(result)
                }
                "3"-> {println(miCuenta.toString())}
                "4" -> break@loop
            }
        }while (true)
    }
    else
    {
        println("Ingrese su Nombre")
        val Nombre: String? = readLine()
        println("Ingrese la cantidad")
        val cant: String? = readLine()
        val miCuenta = Cuenta(Nombre!!, cant!!.toDouble())
        loop@ do {
            println("Que operacion quiere realzar?")
            println("1.- Depositar")
            println("2.- Retirar")
            println("3.- Consultar saldo")
            println("4.- Salir")
            val opcion:String? = readLine()
            when (opcion) {
                "1" -> {
                    var num  = ObtenerDinero()
                    var result  = miCuenta.Ingresar(num)
                    println(result)
                }
                "2"-> {
                    var num = RetirarDinero()
                    var result = miCuenta.Retirar(num)
                    println(result)
                }
                "3"-> {println(miCuenta.toString())}
                "4" -> break@loop
            }
        }while (true)
    }
}
fun ObtenerDinero(): Double{
    println("Ingrese la cantidad")
    val cant: String? = readLine()
    var num = cant!!.toDouble()
    return num
}
fun RetirarDinero(): Double{
    println("Ingrese la cantidad")
    val cant: String? = readLine()
    var num = cant!!.toDouble()
    return num * -1
}
