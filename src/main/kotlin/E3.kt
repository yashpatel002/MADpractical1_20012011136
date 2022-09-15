open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Yash","Patel",19,20012011136,"CE","C","AB8")
    var s2=Student("Saumil","Patel",20,20012011124,"CE","C","AB8")
    var s3=Student("Yash","Patel",20,20012011137,"IT","B","AB7")
    var s4=Student("Niraj","Chothani",21,20012011024,"CE","A","AB7")
    var s5=Student("Mukund","Tapaniya",19,20012011148,"AI","A","AB1")

}