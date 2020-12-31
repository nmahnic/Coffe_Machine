package machine
import java.util.Scanner
import kotlin.math.roundToInt
import kotlin.math.truncate

fun main() {
    val coffe = CoffeeMachine()
    coffe.makeCoffe()
}

class CoffeeMachine(){
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

    var water : Int = 0
    var milk : Int = 0
    var coffee : Int = 0
    var cups: Int = 0
    var N : Int? = 0
    var option : String = ""
    var optionCoffe : String = ""

    fun makeCoffe() {
        option = " "

        while (option != "exit") {
            print("\nWrite action (buy, fill, take, remaining, exit): ")
            option = input.next()
            when (option) {
                "buy" -> {
                    print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                    optionCoffe = input.next()
                    if(checkForDisponibility(optionCoffe)) {
                        when (optionCoffe) {
                            "1" -> {
                                waterStock -= waterNeededE
                                milkStock -= milkNeededE
                                coffeeStock -= coffeeNeededE
                                cupsStock -= 1
                                money += priceE
                            }
                            "2" -> {
                                waterStock -= waterNeededL
                                milkStock -= milkNeededL
                                coffeeStock -= coffeeNeededL
                                cupsStock -= 1
                                money += priceL
                            }
                            "3" -> {
                                waterStock -= waterNeededC
                                milkStock -= milkNeededC
                                coffeeStock -= coffeeNeededC
                                cupsStock -= 1
                                money += priceC
                            }
                            "back" -> continue
                            else -> println("ERROR")
                        }
                    }
                }
                "fill" -> {
                    print("Write how many ml of water do you want to add: ")
                    water = input.nextInt()
                    print("Write how many ml of milk do you want to add: ")
                    milk = input.nextInt()
                    print("Write how many grams of coffee beans do you want to add: ")
                    coffee = input.nextInt()
                    print("Write how many disposable cups of coffee do you want to add: ")
                    cups = input.nextInt()

                    waterStock += water
                    milkStock += milk
                    coffeeStock += coffee
                    cupsStock += cups

                }
                "take" -> {
                    println("I gave you \$${money}")
                    money -= money
                }
                "remaining" -> {
                    println("\nThe coffee machine has:")
                    println("${waterStock} of water")
                    println("${milkStock} of milk")
                    println("${coffeeStock} of coffee beans")
                    println("${cupsStock} of disposable cups")
                    println("\$${money} of money")
                }
                "exit" -> {
                    break
                }
            }
        }
    }
    private fun checkForDisponibility(optionCoffe : String) : Boolean{
        when(optionCoffe){
            "1" ->{
                if(waterStock < waterNeededE){ println("Sorry, not enough water!") }
                if(milkStock < milkNeededE){ println("Sorry, not enough milk!") }
                if(coffeeStock < coffeeNeededE){ println("Sorry, not enough coffee beans!") }
                if((waterStock >= waterNeededE) && (milkStock >= milkNeededE) && (coffeeStock >= coffeeNeededE)){
                    println("I have enough resources, making you a coffee!")
                    return true
                }
            }
            "2" ->{
                if(waterStock < waterNeededL){ println("Sorry, not enough water!") }
                if(milkStock < milkNeededL){ println("Sorry, not enough milk!") }
                if(coffeeStock < coffeeNeededL){ println("Sorry, not enough coffee beans!") }
                if((waterStock >= waterNeededL) && (milkStock >= milkNeededL) && (coffeeStock >= coffeeNeededL)){
                    println("I have enough resources, making you a coffee!")
                    return true
                }
            }
            "3" ->{
                if(waterStock < waterNeededC){ println("Sorry, not enough water!") }
                if(milkStock < milkNeededC){ println("Sorry, not enough milk!") }
                if(coffeeStock < coffeeNeededC){ println("Sorry, not enough coffee beans!") }
                if((waterStock >= waterNeededC) && (milkStock >= milkNeededC) && (coffeeStock >= coffeeNeededC)){
                    println("I have enough resources, making you a coffee!")
                    return true
                }
            }
            "back" -> return true
            else -> return false
        }
        return false
    }
}