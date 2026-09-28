package com.example.laba3

fun main() {
    //task 1
    print("Enter score: ")
    val score = readln().toInt() //.toInt() в числовое значение превращает

    if (score >= 50) {
        println("Pass")
    } else {
        println("Fail")
    }

    //Taks 2
    print("Enter temperature: ")
    val temp = readln().toInt()
    if (temp < 0) {
        println("Freezing")
    } else if (temp in 0..14) {
        println("Cold")
    } else if (temp in 15..24) { //при вводе .. проверяет входит ли число в диапазон
        println("Mild")
    } else {
        println("Warm")
    }

    //Task 3
    print("Enter age: ")
    val age = readln().toInt()
    print("Do you have a ticket? (yes/no): ")
    val hasTicket = readln() == "yes"
    if (age >= 12 && hasTicket) {
        println("Enter")
    } else if (age < 12) {
        println("Too young")
    } else {
        println("Need a ticket")
    }

    //Task 4
    print("Enter age: ")
    val age2 = readln().toInt()

    if (age2 < 13 || age2 > 65) { // || это двойное условие
        println("Discount")
    } else {
        println("Regular")
    }

    //Task 5
    val a = readln().toInt()
    val b = readln().toInt()
    val max = if (a > b) a else b
    println("max = $max")


    //Task 6
    print("Enter score: ")
    val scoree = readln().toInt()
    val grade = when (scoree) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("Grade: $grade")


    //Task 7
    print("Enter n: ")
    val n = readln().toInt()
    val label = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n > 0 && n % 2 == 0 -> "positive even"
        else -> "positive odd"
    }
    println(label)
}
