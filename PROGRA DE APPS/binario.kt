/*codigo morse
fun String.codigoMorse(): String
    {
        val mapCode = mapOf<String, String>(
            "a" to ".-", "b" to "-...", "c" to "-.-.", "d" to "-..", "e" to ".", 
            "f" to "..-.","g" to "--.", "h" to "....", "i" to "..", "j" to "·---", 
            "k" to "-.-", "l" to ".-..", "m" to "--", "n" to "-.", "ñ" to "--.--", 
            "o" to "---", "p" to ".__.", "q" to "--.-", "r" to ".-.", "s" to "...", 
            "t" to "-", "u" to "..-", "v" to "...-", "w" to ".--", "x" to "-..-", 
            "y" to "-.--", "z" to "--..",
            "0" to "-----", "1" to ".----", "2" to "..---", "3" to "...--", 
            "4" to "....-", "5" to ".....", "6" to "-....", "7" to "--...", 
            "8" to "---..", "9" to "----.",
            "." to ".-.-.-", "," to "-.-.--", "?" to "..--..", "\"" to ".-..-.")
        var aux = ""
        this.lowercase().forEach { it ->
            aux += mapCode.getOrDefault(it.toString(), it.toString())
        }
        return aux
    } 
fun main()
    {
        print("Ingrese el texto a codificar: ")
        val texto = readLine() as String
        println("Texto codificado: ${texto.codigoMorse()}")
    }
*/

/*contador de palabras 
fun main() {
    countWords("Me llamo Emmanuel Anguiano y soy de telematica")
}
fun countWords(text: String) {
    val words = mutableMapOf<String, Int>()
    text.lowercase().replace("[^a-z0-9]".toRegex(), " ").split(" ").forEach { key ->
        if (key.isEmpty()) {
            return@forEach
        }
        if (words[key] != null) {
            words[key] = words.getValue(key) + 1
        } else {
            words[key] = 1
        }
    }
    words.forEach { word ->
        println("${word.key} se ha repetido ${word.value} ${if(word.value == 1) "vez" else "veces"}")
    }
}
*/


//Decimal a binario
fun main(){
    var res = mutableListOf<Int>()
    println("dame un valor a convertir: ")
    var x=readLine()!!.toInt()
    while(x>=1){
        println(x)
        if(x%2==0){
            res.add(0)
        }else{
            res.add(1)
        }
        x=x/2
    }
    println(res.reversed())
}