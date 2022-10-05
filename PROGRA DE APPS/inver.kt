fun main() {
	var txt = "Hola Mundo"
    var longitud=txt.length
    var inver=CharArray(longitud)
    var contador=0
    for(indice in longitud-1 downTo 0){
        inver[contador]=txt[indice]
        contador++
    }
     println("texto ")
     println(txt)
     println(" ")
     println("invertido: ")
     println(inver)
}