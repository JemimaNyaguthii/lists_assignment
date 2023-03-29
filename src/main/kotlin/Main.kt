import javax.management.MBeanRegistration

fun main() {
    namesList(listOf("ruthless","better","care","for","the","soul","hurts","adapt","used","strong") )
    heights()
    var person1 = Person("Jem",30,5.0,80)
    var person2 =Person("Carol",15,1.46,43)
    var person3 =Person("Loise",19,2.34,50)
    var person4 =Person("Amina",18,2.45,60)
    var friendsList= listOf<Person>(person1,person2,person3,person4)
    var friendslist=friendsList.sortedByDescending{Person->Person.age }
    println(friendslist)



}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun namesList(names:List<String>):List<String> {
    names.forEachIndexed { index, y ->
        if (index % 2 == 0) {
            println(y)
        }
    }
    return names
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
class Person(var Name: String,var age: Int,var height: Double,var weight: Int)
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Int)
fun namesOfCars(motors:List<Car>):Int {
    var average = 0
    motors.forEach { x ->
        x.mileage
        average += x.mileage}
        var averageTotal = motors.count()
        return averageTotal

    }












