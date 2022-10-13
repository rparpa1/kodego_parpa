fun main() {
    var apple1 = "Apple"
    var apple2 = "apple"
    var apple3 = "ApPlE"
    var apple4 = "Apple"
    var int:Int = 100
    var short:Short = 100
    var long:Long = 100L

    var result:Boolean = false

    result = long == short.toLong()
    result = long != short.toLong()

    result = apple1 > int.toString()
    result = apple1 < int.toString()
    result = apple1 <= int.toString()
    result = apple1 >= int.toString()

    result = true && true
    result = true and true
    result = !true
    result = true || false
    result = true or false

    result = apple1 > apple2

    println("Result : $result")
}