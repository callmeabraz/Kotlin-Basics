fun main(){

    var x = 10
    println("The Value of x is $x")
    var y= 20
    println("The Vale of y is $y")

    var z:Int

    //Swapping using another variable
    z = x // z stores the value of x
    x = y // Now x value changes to that of y
    y = z // y is assigned the value of x which we had earlier stored in z

    println("Swapped Value of x: $x")
    println("Swapped Value of y: $y")


}