fun main(){
    val area= area_triangle(B = 14.5, H = 20.0)
    println("The area is : $area")

    val age = checkage(age = 45)
    println(age)

    val largest = checknum(X = 6, Y = 5, Z = 7)
    println(largest)
}

fun area_triangle(B:Double, H:Double): Double {
    val area:Double = (B/2)*H
    return area
}

fun checkage(age:Int): String {
    if(age<= 50 ){
       return "You have some years to go"
    }
    else if (age >= 51 && age <=61){
        return "You have 10 year go"
    }
    else{
        return "You must be retired"
    }
}

fun checknum(X:Int, Y:Int, Z:Int): String {
    val largest:String = if(X>Y && X>Z){
                            return "X is the largest"
                        }
                        else if ( Y>X && Y>Z){
                            return "Y is the largest"
                        }
                        else{
                            return "Z is the largest"
                        }
}
