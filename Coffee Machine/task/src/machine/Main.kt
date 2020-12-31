package machine
import java.util.Scanner
import kotlin.math.roundToInt
import kotlin.math.truncate

fun main() {
    val input = Scanner(System.`in`)

    val waterNeeded : Float = 200F
    val milkNeeded : Float = 50F
    val coffeeNeeded : Float = 15F

    var water : Float
    var milk : Float
    var coffee : Float
    var cups: Int
    var N : Int? = 0

    print("Write how many ml of water the coffee machine has:")
    water = input.nextFloat()
    print("Write how many ml of milk the coffee machine has:")
    milk = input.nextFloat()
    print("Write how many grams of coffee beans the coffee machine has:")
    coffee = input.nextFloat()
    print("Write how many cups of coffee you will need:")
    cups = input.nextInt()


    var lista = listOf(((milk/milkNeeded)),(water/waterNeeded),(coffee/coffeeNeeded))
    var minOfList :Float? = lista.min()
    println("LISTA: ${lista}")
    minOfList?.let {
        N = truncate(it).toInt()
    }
    println("N: ${N}")
    when(N){
        in 0..cups-1 -> println("No, I can make only ${N} cup(s) of coffee")
        cups -> println("Yes, I can make that amount of coffee")
        else -> println("Yes, I can make that amount of coffee (and even ${N?.minus(cups)} more than that)")
    }
}

