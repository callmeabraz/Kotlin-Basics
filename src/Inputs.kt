fun main(){

    println("Enter your name")
    //readLine() enables us to input data
    //" !! " makes sure the value entered is not null
    // .toString converts the input to String
    val name:String = readLine()!!.toString()

    println("Name : $name")
}