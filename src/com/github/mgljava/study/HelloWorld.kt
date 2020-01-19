package com.github.mgljava.study

fun main() {
    println("Hello World")
    println(sum(2, 3))
    println("div is : ${div(6, 3)}")
    printItem(9, 8)
    printVal()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun div(a: Int, b: Int) = a / b

fun printItem(a: Int, b: Int) {
    println("sum of a and b is : ${a + b}")
}

fun printVal() {
    val a: Int = 3
    val b = 2
    val c: Int = a + b
    println("a is $a, b is $b, c is $c")
}