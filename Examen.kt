import java.awt.List

fun main() {
    var autos = listOf<Any>()
    loop@ do {
        println("1.- Armar un nuevo auto")
        println("2.- Ver autos armados")
        println("3.- Salir")
        val opcion:String? = readLine()
        when (opcion) {
            "1" -> autos += ensamblarAuto()
            "2"-> VerAutos(autos)
            "3" -> break@loop
        }
    }while (true)
}

fun ensamblarAuto (): Any
{
    var Caracteristicas = listOf<String>()
    data class Auto(var Marca: String, var Madelo: String, var Caracteristicas: kotlin.collections.List<String>,
                    var CaracteristicasEspeciales: kotlin.collections.List<String>)
    println("Ingrese la marca: ")
    var Marca:String? = readLine()
    println("Ingrese la modelo: ")
    var Modelo:String? = readLine()
    println("Que tipo de transmisión tiene su auto? 1: Automatica 2:Manual")
    var TipoTrans:String? = readLine()
    if(TipoTrans!! == "1") Caracteristicas += "Transmisión Automatica" else  Caracteristicas += "Transmisión Manual"
    println("Tiene aire acondicionado? 1:Si 2:No")
    var AireAcondicionado:String? = readLine()
    if(AireAcondicionado!! == "1") Caracteristicas += "Aire Acondicionado" else ""
    println("Tiene frenos ABS? 1:Si 2:No")
    var Frenos:String? = readLine()
    if(Frenos!! == "1") Caracteristicas += "Frenos ABS" else ""
    println("Tiene bolsa de aire? 1:Si 2:No")
    var BolsaAire:String? = readLine()
    if(BolsaAire!! == "1") Caracteristicas += "Bolsa de aire" else ""
    println("Tiene pantalla tactil? 1:Si 2:No")
    var PantallaTactil:String? = readLine()
    if(PantallaTactil!! == "1") Caracteristicas += "Pantalla tactil" else ""
    println("Tiene controles electricos? 1:Si 2:No")
    var ControlesElectricos:String? = readLine()
    if(ControlesElectricos!! == "1") Caracteristicas += "Controles Electricos" else ""
    println("\n\nIngrese 3 caracteristicas que tendra el auto de la siguiente lista:\n" +
            "Faros de niebla\nFaros de LEDS\nAsientos de piel\nCargador Inalambrico\nCamara de reversa\nMonitoreo punto ciego")
    println("Caracteristica especial 1")
    var CAE1:String? = readLine()
    println("Caracteristica especial 3")
    var CAE2:String? = readLine()
    println("Caracteristica especial 3")
    var CAE3:String? = readLine()
    val CAE = listOf<String>(CAE1!!, CAE2!!, CAE3!!)
    val Carro = Auto(Marca!!, Modelo!!, Caracteristicas, CAE)

    return Carro
}

fun VerAutos(autos: kotlin.collections.List<Any>)
{
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
    for (auto in autos) {
        println(auto.toString())
    }
    println("Total de autos: "+autos.count())
}