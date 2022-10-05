fun main(){
    do{
    println("menu tarea\n ")
    println("1- agregar")
    println("2- editar")
    println("3- eliminar")
    println("4- mostar")
    println("5- salir")
    println("\n seleccina una opcion del menu: ")
    var opcion=readLine()!!.toInt()

    when(opcion){
        1 ->{  
            agregar()
            println("\n pulsa enter para continuar")
            readLine()
        }
        2 ->{  
            editar()
            println("\n pulsa enter para continuar")
            readLine()
        }
        3 ->{  
            eliminar()
            println("\n pulsa enter para continuar")
            readLine()
        }
        4 ->{  
            mostar()
            println("\n pulsa enter para continuar")
            readLine()
        }
        5 ->{  
            salir()
            println("\n pulsa enter para continuar")
            readLine()
        }
        //1 -> println("editar")
        //3 -> println("eliminar")
        //4 -> println("mostar")
        //5 -> println("saliendo del programa")
        }
    } while(opcion!=5 || opcion>5)
}

fun agregar(){
    println("codigo para agregar un array")
}

fun editar(){
    println("codigo para editar un array")
}

fun eliminar(){
    println("codigo para eliminar un array")
}

fun mostar(){
    println("codigo para mostrar un array")
}

fun salir(){
    println("saliedno del programa")
}