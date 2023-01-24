import java.io.File

class Cantante(
    var nombreArtistico:String
) {
    init {
        this.nombreArtistico
    }
    val nombre:String = ""
    val apellido: String = ""
    val edad: Int = 0
    val nacionalidad: String= ""
    val tipoVoz: String = ""
    val canciones: MutableList<Cancion> = mutableListOf()
    val listaCanciones: MutableList<String> = mutableListOf()


    fun createCancion(cancion: Cancion): MutableList<Cancion> {
        canciones.add(cancion)
        return canciones
    }

    //leer cam
    fun readCancion(): String{
        var salida: String = ""
        canciones.forEachIndexed { index, cancion ->
            println(" ${index}. ${cancion}")
        }
        return salida
    }
    //lista de las canciones
    fun listarCanciones(salida: String): MutableList<String> {
        listaCanciones.add(salida)
        return listaCanciones
    }

    fun imprimirListaCancions(listaCanciones: ArrayList<String>){
        var salida: String = ""
        listaCanciones.forEachIndexed {index, listaCanciones ->
            print("${index}. ${listaCanciones}")
        }
        println(salida)
    }


    //update
    fun updateCancion(indice: Int, nombreNuevo: String){
        readCancion()
        this.canciones.forEachIndexed{index: Int, cancion: Cancion ->
            if(indice == index){
                var nuevo = nombreNuevo
                nuevo = cancion.nombreCancion
            }
        }


    }

    //delete
    fun deleteCancion(indice: Int){
        readCancion()
        for (position in canciones.indices){
            if(indice == position){
                canciones.removeAt(position)
            }
        }

    }
    //toString

    override fun toString(): String {
        return "\n${nombreArtistico}" +
                "\n${nombre} ${apellido}" +
                "\n${edad}" +
                "\n${nacionalidad}" +
                "\n${tipoVoz}" +
                "\n${canciones}"

    }


}