import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var number = readLine()!!.toInt()
    var limit = readLine()!!


    if(limit == "no limit") check(number)
    else check(number, limit.toInt())

}

fun check(s: Int, l: Int = 60){
    if(s > l)
        println("Exceeds the limit by ${s - l} kilometers per hour")
    else
        println("Within the limit")
}

/*
fun check(s: Int, l: Int = 60) = if (s <= l) "Within the limit" else {
    "Exceeds the limit by ${s - l} kilometers per hour"
}

fun main() {
    readLine()!!.toInt().also { s ->
        readLine()!!
            .let { if (it == "no limit") check(s) else check(s, it.toInt()) }
            .let(::print)
    }
}

*/