package com.github.mgljava.study

fun main() {
    println("Hello World")
    println(sum(2, 3))
    println("div is : ${div(6, 3)}")
    printItem(9, 8)
    printVal()
    printlnFlag()
    println("two number maxOf is ${maxOf(10, 11)}")
    println("two number maxOf1 is ${maxOf1(14, 11)}")
    printlnFlag()
    println("parseInt is ${parseInt("190")}")
    println("printProduct is ${printProduct("10", "100")}")
    println("printProduct is ${printProduct("oo", "100")}")
    println("printProduct is ${printProduct("10", "oo")}")
    println("printProduct is ${printProduct("x1", "oo")}")
    printlnFlag()
    println("getStringLength is ${getStringLength("aa")}")
    println("getStringLength is ${getStringLength(29)}")
}

private fun printlnFlag() {
    println("-----------------------")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun div(a: Int, b: Int) = a / b

fun printItem(a: Int, b: Int) {
    println("sum of a and b is : ${a + b}")
}

// 变量定义
fun printVal() {
    val a: Int = 3
    val b = 2
    val c: Int = a + b
    println("a is $a, b is $b, c is $c")
}

fun maxOf(a: Int, b: Int): Int {
    return if (a > b)
        a
    else
        b
}

// 简单写法
fun maxOf1(a: Int, b: Int) = if (a > b) a else b

// 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    var a = parseInt(arg1)
    var b = parseInt(arg2)
    if (a != null && b != null) {
        println(a * b)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}