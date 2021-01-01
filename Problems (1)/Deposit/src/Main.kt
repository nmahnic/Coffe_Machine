import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var action = scanner.nextLine()
    var number = scanner.nextDouble()

    select(action, number)
}

fun select(action: String, number: Double){
    when(action){
        "amount" ->{calculate(sAmount = number.toInt())}
        "percent" ->{calculate(yPercent = number)}
        "years" ->{calculate(year = number.toInt())}
    }
}
fun calculate (sAmount: Int = 1000, yPercent: Double = 5.0, year:Int = 10){
    var res : Double = 1.0
    var percentage : Double = yPercent / 100
    for(i in 1..year) {
        res *= (1 + percentage)
    }
    var final = (sAmount * res).toInt()
    println(final)
}