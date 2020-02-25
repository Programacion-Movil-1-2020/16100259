class Persona {
    private var Nombre: String = ""
        get() = field
        set(value) {
            field = value
        }
    private var Edad: Int = 0
        get() = field
        set(value) {
            field = value
        }
    private var DNI: Double = 0.0
    private var Sexo: Char = 'M'
        get() = field
        set(value) {
            field = value
        }
    private var Peso: Double = 0.0
        get() = field
        set(value) {
            field = value
        }
    private var Altura: Int = 0
         get() = field
         set(value) {
            field = value
        }

    constructor() {
        this.DNI = GenerarDNI()
    }
    constructor(Nombre: String, Edad: Int, Sexo: Char) {
        this.Nombre = Nombre
        this.Edad = Edad
        this.Sexo = Sexo
        this.DNI = GenerarDNI()
    }

    constructor(Nombre: String, Edad: Int, Sexo: Char, Peso: Double, Altura: Int) {
        this.Nombre = Nombre
        this.Edad = Edad
        this.Sexo = Sexo
        this.Peso = Peso
        this.Altura = Altura
        this.DNI = GenerarDNI()
    }
    fun CalcularIMC(): Int {
        var Alturamts = Altura/100
        var IMC = (Peso/(Alturamts*Alturamts)).toDouble()
        var Res = 0
        if ( IMC >= 0 && IMC <= 19 )
            Res =  -1
        if ( IMC >= 20 && IMC <= 24 )
            Res = 0
        if ( IMC >= 25)
            Res = 1
        return Res
    }
    fun EsMayorEdad(): Boolean{
        return (Edad >= 18)
    }
    fun comprobarSexo(Sexo: Char) {
        if(Sexo != this.Sexo)
            this.Sexo = 'H'
    }

    override fun toString(): String {
        return "Nombre de la persona:$Nombre \nDNI:'$DNI' \nEdad:$Edad \nPeso: $Peso \nAltura:$Altura"
    }
    fun GenerarDNI(): Double {
        var DNI = Math.random() * 10000000
        return DNI
    }
}