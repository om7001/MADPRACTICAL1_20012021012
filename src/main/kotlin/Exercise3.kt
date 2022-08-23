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
    var s1=Student("Om","Maniya",20,20012021012,"IT","C","AB9")
    var s2=Student("Harsh","Maniya",20,20012011059,"CE","A","AB7")
    var s3=Student("Yash","Lakhani",19,20012021042,"IT","B","AB9")
    var s4=Student("Swet","Nandola",19,20012021015,"IT","C","AB8")
    var s5=Student("Hari","Talaviya",20,20012021063,"IT","A","AB2")

}