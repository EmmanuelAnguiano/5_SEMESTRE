fun main(){
    for(i in 1..100){
        if(i%3==0 && i%5==0){
            println("king kong")
        }else if(i%3==0){
            println("king")
        }else if(i%5==0){
            println("kong")
        }else{
            println(i)
        }
    }
}