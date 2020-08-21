package edu.stanford.rkpandey.kotlinpractice

fun main() {
    println("hello world")
    print("Enter the base amount for your meal: ")
    val myVariable = 89
    var myOtherVariable = 89
    myOtherVariable = 50
    
    val baseAmount = readLine()
    println("Base amount $baseAmount")

    print("Enter the tip percent: ")
    val tipPercent = readLine()
    println("Tip percent: $tipPercent")
    
    // 8.42 --> Double
    // 8 --> Int
    val baseAmountNumber = baseAmount!!.toDouble()
    val tipPercentNumber = tipPercent!!.toInt()
    
    // base amount * tip percent / 100
    
    val tipAmountNumber = baseAmountNumber * tipPercentNumber / 100
    println("The tip amount is $tipAmountNumber")
    val totalAmount = baseAmountNumber + tipAmountNumber
    println("The total amount is $totalAmount")
    
}