class menu {
    var opciones: Int = 0
    var cantante = Cantante("")


    fun seleccion(){
        println("Seleccione una opcion: ")
        println("1. Canciones")
        println("2. Cantantes")
        opciones = readln().toInt()
        if (opciones ==1){
            seleccionCancion()
        } else if (opciones ==2){

        }else{
            println("Selección incorrecta")
            seleccion()
        }

    }

    fun seleccionCancion() {

        //ENTRA AL MENU DE OPCIONES
        println("Seleccione una opcion: ")
        println("1. Agregar una nueva cancion")
        println("2. Buscar una cancion")
        println("3. Editar Cancion")
        println("4. Eliminar una cancion")
        opciones = readln().toInt()
        when(opciones){
            1->{
                agregarCancion()
            }
            2->{
                buscarCancion(cantante)
            }
            3 -> {
                editarCancion(cantante)
            }
            4 ->{
                elimincarCancion(cantante)
            }
        }
    }


    fun agregarCancion(): Cancion{
        println("==============Agregando Nueva Cancion==============")
        print("Ingrese el nombre de la canción: ")
        var nombreCancion = readln()
        print("Ingrese el nombre del Autor: ")
        var autor = readln()
        print("Ingrese el duración: ")
        var duracion = readln().toDouble()
        print("Ingrese nombre del álbum que pertenece: ")
        var album = readln()
        print("Ingrese la fecha de lanzamiento: ")
        var fechaLanzamiento = readln()

        var nuevoAutor = Cantante(autor)
        var nuevaCancion = Cancion(nombreCancion, nuevoAutor, duracion, album, fechaLanzamiento)
        nuevoAutor.createCancion(nuevaCancion)
        println("Nueva Cancion agregada!!! de ${nuevoAutor.nombreArtistico}")
        buscarCancion(nuevoAutor)
        //var nuevaSalida: String = nuevoAutor.readCancion()
        //var nuevaLista = nuevoAutor.listarCanciones(nuevaSalida)
        //nuevoAutor.imprimirListaCancions(nuevaLista as ArrayList<String>)
        seleccionCancion()
        return nuevaCancion
    }

    fun buscarCancion(autor: Cantante){
        println("==============Lista de Canciones============== ")
        autor.readCancion()
        seleccionCancion()
    }

    fun editarCancion(autor: Cantante){
        println("==============Editando Cancion==============")
        println("Seleccione una Cancion")
        buscarCancion(autor)
        opciones = readln().toInt()
        println("Ingrese el Nuevo Nombre de la Cancion")
        var nuevoNombre = readln()
        autor.updateCancion(opciones,nuevoNombre )
    }

    fun elimincarCancion(autor: Cantante){
        println("==============Eliminando Cancion ==============")
        println("Seleccione una Cancion")
        buscarCancion(autor)
        opciones = readln().toInt()
        autor.deleteCancion(opciones)
    }


}