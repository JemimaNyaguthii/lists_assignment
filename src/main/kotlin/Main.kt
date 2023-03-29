fun main() {

    names(listOf("ruthless","better","care","for","the","soul","hurts","adapt","used","strong") )

    var x = Person()
    var person2 =("Carol",15,1.46,43.4)
    var person3 =Person("Loise",19,2.34,50.4)
    var person4 =Person("Amina",18,2.45,60.2)
    var friendsList= mutableListOf(person1,person2,person3,person4)
    var friendslist=friendsList.sortedByDescending{Person->Person.age }
    println(friendslist)


}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun names(names:List<String>):List<String{
    names.forEachIndexed{ index, y ->
        if (index % 2==0)
            println(y)
    }
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun heights(){
    var height= mutableListOf(1.18,1.00,2.8,2.46)
    println(height.average())
    println(height.sum())

     }
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

 data class Person(var Name:String,var age:Int,var height:Double,var weight:Double) {
}




