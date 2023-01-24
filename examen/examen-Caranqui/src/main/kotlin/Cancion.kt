class Cancion(
    var nombreCancion: String,
    val autor: Cantante,
    var duracion: Double,
    var album: String,
    var fechaLanzamiento: String
){
    init {
        this.nombreCancion
        this.autor
        this.duracion
        this.album
        this.fechaLanzamiento
    }
    //funciones

    override fun toString(): String {
        return "Su cancion es: " +
                "\nTitulo: ${nombreCancion}" +
                "\nAutor: ${autor.nombreArtistico}" +
                "\nDuracion: ${duracion}" +
                "\nAlbum: ${album}" +
                "\nLanzamiento: ${fechaLanzamiento}"
    }
}