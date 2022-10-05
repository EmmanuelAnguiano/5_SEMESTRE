/*Código 3 (valor .5):
Mostrar los números del 1 al 100 (siempre).
Además del número mostrar:
Si es par o impar.
Si es par decir si es múltiplo de 3.
Si es impar decir si es múltiplo de 5.
fun main(){
    for(i in 1..100){ 
        println(i)
        if(i%2==0 && i%3==0){
            println("par y multiplo de 3")
        }else if(i%2==0){
            println("par")
        }else if(i%2==1 && i%5==0){
            println("impar y multiplo de 5")
        }else if(i%2==1){
            println("impar")
        }
    }
}*/

/*Código 4 (valor .3):
Mostrar la instrucción "Ingresa el nombre de tu juego favorito".
Leer el nombre del juego favorito.
Mostrar el nombre del juego favorito.
fun main() {
    print("Ingresa tu juego favorito:")
    val juego= readLine()
    
    print("tu juego favortito es: $juego")
}*/

///////////////////

/*Código 1 (valor .5):
Inicializar una lista con los siguientes valores:
uno, dos, tres.
Muestre la lista.
Elimine "uno".
Actualice "dos" a "tres".
Actualice "tres" a "cuatro".
Agregue a la lista "cinco".
Mostrat la lista.
*/


fun main() {
    var nums : MutableList<String> = mutableListOf("uno", "dos", "tres")
    println("lsita sin actualizar: $nums")
    nums[1] = "tres"
    nums[2] = "cuatro"
    nums.add("cinco")
    nums.remove("uno")
    println("lista actualizada: $nums")
} 

/*Código 5 (valor .3):
Inicializar una lista con los siguientes valores:
Tortas, Paninis, Pizza, Ramen.
Mostrar la instrucción "Ingresa una nueva comida".
Leer el nombre de la nueva comida.
Agregarla a la lista.
Mostrar la lista.
*/
/* 
fun main() {
    var comidas : MutableList<String> = mutableListOf("Tortas", "Paninis", "Pizza", "Ramen")
    println("ingresa tu comida favorita")
    var ag=readLine()!!
    comidas.add(ag)
    println("$comidas")
}*/


