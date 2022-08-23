fun main ()
{
    fun add(vararg x:Int){
        var add:Int = x[0]
        for(i in x[1]..x.size) {
            add += i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("addition of $y is $add")
    }

    fun sub(vararg x:Int) {
        var sub: Int = x[0]
        for (i in x[1]..x.size){
            sub -= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("subtraction of $y is $sub")
    }

    fun mul(vararg x:Int){
        var mul:Int = x[0]
        for(i in x[1]..x.size) {
            mul *= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("multiplication of $y is $mul")
    }
    fun div(vararg x:Int){
        var div:Int = x[0]
        for(i in x[1]..x.size) {
            div /= i
        }
        var y:String = ""
        for(i in x){
            y += "$i,"
        }
        println("divison of $y is $div")
    }
    add (1,2,3,4,5,6)
    sub(30,1,4,5)
    mul(5,2)
    div(20,2)
}