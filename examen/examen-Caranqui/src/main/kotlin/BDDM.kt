import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.nio.charset.Charset

class BDDM {
    companion object{
        fun exportarDatos(cantante: Cantante){
            //definimos la ruta de almacenamiento
            val path = File("src\\main\\resources${cantante.nombreArtistico}.txt")
            //si el archivo no exisre lo creamos
            if(!path.exists()){
                path.createNewFile()
            }
            var fw: FileWriter = FileWriter(path)
            var bw: BufferedWriter = BufferedWriter(fw)
            bw.write(cantante.readCancion())
            bw.close()
        }

        fun leerArch(nombreArchivo: String): Cantante{
            val nombre = nombreArchivo.split("_")
            var ncantante = Cantante(nombre[0])
            val nombArch = File("src\\main\\resources\\${nombreArchivo}.txt")
            val read = BufferedReader(FileReader(nombArch, Charset.defaultCharset()))
            read.lines().forEach{
                val cancion: List<String> = it.split(";")
                val autor: Cantante = Cantante(cancion[1])
                val nuevoCancion = Cancion(cancion[0], autor,cancion[2].toDouble(),cancion[3], cancion[4])
                ncantante.createCancion(nuevoCancion)
            }
            return ncantante
        }

    }
}