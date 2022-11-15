/* decimal a binario
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
*/
/*ciclos

fun main(){
    do{
        println("menu\n ")
        println("1- if")
        println("2- while")
        println("3- for")
        println("\n seleccina una opcion del menu: ")
        var opcion=readLine()!!.toInt()
    
        when(opcion){
            1 ->{  
                funif()
                println("\n pulsa enter para continuar")
                readLine()
            }
            2 ->{  
                funw()
                println("\n pulsa enter para continuar")
                readLine()
            }
            3 ->{  
                funfor()
                println("\n pulsa enter para continuar")
                readLine()
            }
            }
        } while(opcion!=3 || opcion>3)
    }


    fun funif(){
        println("dame un numero: ")
        var x=readLine()!!.toInt()
        if(x==5){
            println("tu numero es un 5")
        }else{
            println("tu numero no es un 5")
        }
    }

    fun funw(){
            val a: Int = 7
            val b: Int = 9
            val multi = a * b
            println("La multiplicacion es: $multi")
            var c=0;
            while (c<5)
            {
                c=c+1;
                println("La multiplicacion es mayor a 40")
            }
    }

    fun funfor(){
        println("dame un numero: ")
        var x=readLine()!!.toInt()
        for(i in 1..100){
            if(i%x==0){
                println("numero multiplo de " + x)
            }else{
                println(i)
            }
        }
    }
*/

fun main() {
    countWords("Me hola hola hola emmanuel")
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
        println("la palabra ${word.key} se ha repetido ${word.value} ${if(word.value == 1) "vez" else "veces"}")
    }
}
