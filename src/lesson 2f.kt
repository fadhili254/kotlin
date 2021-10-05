import  java.util.*


fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter your marks:")
    val marks: Double= scanner.nextDouble()
    println("Your marks are $marks")

    //if statement follows
    if (marks < 30){
        println("Failed")
    }
    else if (marks  >=30 && marks < 50){
        println("Average")
    }
    else if (marks >=50 && marks < 70){
        println("Good")
    }
    else if (marks >=70 && marks <=100){
        println("Excellent")
    }
    else{
        println("Marks invalid")
    }
}