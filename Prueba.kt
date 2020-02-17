fun main() {
    var Computadora = ""
    var numcomp = 1
    loop@ do {
        println("1.- Armar un nuevo equipo")
        println("2.- Ver equipos armados")
        println("3.- Salir")
        val opcion:String? = readLine()
        when (opcion) {
            "1" -> Computadora += "Computadora # "+numcomp+"\n"+ArmarPC()
            "2"-> println(Computadora)
            "3" -> break@loop
        }
        numcomp++
    }while (true)
}

fun ArmarPC (): String
{
    var Cadena = ""
    println("Seleccione el procesador: ")
    println("1.- Intel Core 3")
    println("2.- Intel Core 5")
    println("3.- Intel Core 7")
    var opcion:String? = readLine()
    when (opcion) {
        "1" -> Cadena+="Procesador: Intel Core 3\n"
        "2"-> Cadena+="Procesador: Intel Core 5\n"
        "3" -> Cadena+="Procesador: Intel Core 7\n"
    }
    println("Seleccione el almacenamiento: ")
    println("1.- SSD de 240 GB")
    println("2.- HHD de 240 GB")
    opcion = readLine()
    when (opcion) {
        "1" -> Cadena+="Almacenamineto: HHD de 240 GB\n"
        "2"-> Cadena+="Almacenamiento: HHD de 240 GB\n"
    }
    println("Seleccione la memoria RAM: ")
    println("1.- 4 GB")
    println("2.- 8 GB")
    println("3.- 16 GB")
    println("4.- 32 GB")
    opcion = readLine()
    when (opcion) {
        "1" -> Cadena+="RAM: 4 GB\n"
        "2"-> Cadena+="RAM: 4 GB\n"
        "3"-> Cadena+="RAM: 16 GB\n"
        "4"-> Cadena+="RAM: 32 GB\n"
    }
    println("Seleccione la tarjeta grafica: ")
    println("1.- integrada")
    println("2.- Nvidia 1050Ti")
    opcion = readLine()
    when (opcion) {
        "1" -> Cadena+="Tarjeta grafica: Integada\n"
        "2"-> Cadena+="Tarjeta grafica: Nvidia 1050Ti\n"
    }
    return Cadena
}