fun main(){
    divide()
    subtract()
    for(i in 1..100) {
        bmi(weight = 50.0, height =i)
    }
}

// global variables
val x = 45
val y = 50
fun divide(){
    // access your global
    val answer = x/y
    println("Your division is $answer")
}

fun subtract(){
    val answer = x - y
    println("Your subtraction is $answer")
}

//some functions can take params
//when calling the function, you provide weight and values
fun bmi(weight:Double, height: Int){
    val bmi = weight/ (height * height)
    println("BMI is $bmi")

}