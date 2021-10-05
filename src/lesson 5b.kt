fun main(){
    val fullname = combine("Allan", "John")
    println(fullname)

    val money_kes = currency(money_usd = 45.0, rate = 110.0)
    println("The answer is $money_kes Ksh")

    val answer = area_circle()
    println("The area is : $answer")


}

fun combine(first:String, last:String):String{
    val fullname: String = "$first $last"
    return fullname //what type are we returning
}

fun currency(money_usd:Double, rate:Double, ): Double{
    val money_kes = money_usd * rate
    return money_kes
}

//create a function to find area circle
//use params and return

fun area_circle():Double{
    val radius = 45
    val pi = 3.142
    val answer = pi * (radius * radius)
    return answer
}

