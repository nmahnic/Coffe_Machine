package machine
import java.util.Scanner
import kotlin.math.roundToInt
import kotlin.math.truncate

fun main() {
    val input = Scanner(System.`in`)

    var waterStock : Int  = 400
    var milkStock : Int  = 540
    var coffeeStock : Int  = 120
    var cupsStock : Int = 9
    var money : Int = 550

    val waterNeededE : Int  = 250
    val milkNeededE : Int  = 0
    val coffeeNeededE : Int  = 16
    val priceE : Int = 4
    val waterNeededL : Int  = 350
    val milkNeededL : Int  = 75
    val coffeeNeededL : Int  = 20
    val priceL : Int = 7
    val waterNeededC : Int  = 200
    val milkNeededC : Int  = 100
    val coffeeNeededC : Int  = 12
    val priceC : Int = 6

    var water : Int
    var milk : Int
    var coffee : Int
    var cups: Int
    var N : Int? = 0
    var option : String
    var optionCoffe : Int

    println("The coffee machine has:")
    println("${waterStock} of water")
    println("${milkStock} of milk")
    println("${coffeeStock} of coffee beans")
    println("${cupsStock} of disposable cups")
    println("${money} of money\n")

    option = ""

    while(option != "exit"){
        print("Write action (buy, fill, take, remaining, exit):")
        option = input.nextLine()
        when (option) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                optionCoffe = input.nextInt()

                when (optionCoffe) {
                    1 -> {
                        waterStock -= waterNeededE
                        milkStock -= milkNeededE
                        coffeeStock -= coffeeNeededE
                        cupsStock -= 1
                        money += priceE
                    }
                    2 -> {
                        waterStock -= waterNeededL
                        milkStock -= milkNeededL
                        coffeeStock -= coffeeNeededL
                        cupsStock -= 1
                        money += priceL
                    }
                    3 -> {
                        waterStock -= waterNeededC
                        milkStock -= milkNeededC
                        coffeeStock -= coffeeNeededC
                        cupsStock -= 1
                        money += priceC
                    }
                    else -> println("ERROR")
                }

                println("\nThe coffee machine has:")
                println("${waterStock} of water")
                println("${milkStock} of milk")
                println("${coffeeStock} of coffee beans")
                println("${cupsStock} of disposable cups")
                println("${money} of money")
            }
            "fill" -> {
                print("Write how many ml of water do you want to add:")
                water = input.nextInt()
                print("Write how many ml of milk do you want to add:")
                milk = input.nextInt()
                print("Write how many grams of coffee beans do you want to add:")
                coffee = input.nextInt()
                print("Write how many disposable cups of coffee do you want to add:")
                cups = input.nextInt()

                waterStock += water
                milkStock += milk
                coffeeStock += coffee
                cupsStock += cups

                println("\nThe coffee machine has:")
                println("${waterStock} of water")
                println("${milkStock} of milk")
                println("${coffeeStock} of coffee beans")
                println("${cupsStock} of disposable cups")
                println("${money} of money")
            }
            "take" -> {
                println("I gave you \$${money}")
                money -= money
                println("\nThe coffee machine has:")
                println("${waterStock} of water")
                println("${milkStock} of milk")
                println("${coffeeStock} of coffee beans")
                println("${cupsStock} of disposable cups")
                println("${money} of money")
            }
            "remaining" -> {
                println("\nThe coffee machine has:")
                println("${waterStock} of water")
                println("${milkStock} of milk")
                println("${coffeeStock} of coffee beans")
                println("${cupsStock} of disposable cups")
                println("${money} of money")
            }
            "exit" -> {break}
            else -> println("ERROR")
        }
    }
}

/*
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
*/