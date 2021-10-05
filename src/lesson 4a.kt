fun main(){
    //array is where one variable can store many values
    val fruits = arrayOf("Apple", "Mango", "Passion", "Oranges", "Watermelon")
    //we count array items from zero
    println(fruits[0] +" and " +fruits[1] + " and " +fruits[2])
    //fruit[index]

    val languages = arrayOf<String>("Python","HTML", "CSS","Kotlin","Java" )
    println(languages[0] +" and " +languages[1] +" and "+languages[2])

    val marks = arrayOf<Int>(45, 78, 89, 45, 56, 12, 56, 78)
    println("The student scored"+marks[0])

    //iterate arrays
    for (fruit in fruits){
        println(fruit)//print each fruit at a time
        if (fruit.toLowerCase() == "mango"){
            break //the loop breaks when mango is reached
        }
        else{
            continue
        }//end else
    }
}