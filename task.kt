fun main(){
    var a=4
    var b=15
    var c=27

    var sum= (a+b+c)
    var avg=sum/40
    println(avg)

    if (avg>=80) {
        println("A")
    }
    else if(avg>=60){
        println("B")
    }
    else if(avg>=40) {
        println("C")
    }
    else if (avg<=20) {
        println("D")
    }

}