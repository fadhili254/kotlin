//function is a block of reusable codes
//main is an example of a function
fun main(){
   callme()
    multiply()
    checkNum()
}

fun callme(){
    println("This is a nice function")
}

fun multiply(){
    val x = 45
    val y = 89
    val answer = x * y
    println("The summation is $answer")
}
 val  z = 40 // this is a global variable its not in any function
//global variables can be accessed by any other function

fun checkNum(){
    //below variables is inside this function is called local variable
    //local variable cannot be accessed outside this function
    val x = 5
    when{
        x > 0 -> println("Its POS")
        x == 0 -> println("Its ZERO")
        x < 0 -> println("Its NEG")
        else -> print("Invalid")
    }
}