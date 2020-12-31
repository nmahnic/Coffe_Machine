package machine
import java.util.Scanner
import kotlin.math.roundToInt
import kotlin.math.truncate

fun main() {
    val input = Scanner(System.`in`)

    val waterNeeded : Int  = 200
    val milkNeeded : Int  = 50
    val coffeeNeeded : Int  = 15
    var cups: Int

    print("Write how many cups of coffee you will need:")
    cups = input.nextInt()
    println("For ${cups} cups of coffee you will need:")
    println("${waterNeeded*cups} ml of water")
    println("${milkNeeded*cups} ml of milk")
    println("${coffeeNeeded*cups} g of coffee beans")
}

