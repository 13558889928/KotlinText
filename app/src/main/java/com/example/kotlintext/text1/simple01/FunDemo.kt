package com.example.kotlintext.text1.simple01


// TODO: 2020/6/22 函数
/**
 * @author YQL
 * @date :2020/6/22 10:39
 * @description:
 */

fun main(): Unit {
//    println(add(1, 2))
    lenMethod(1, 2, 3, 4, 5, 6, 7)

    //lambda表达式函数
    val addMethod: (Int, Int) -> Int = { number1, number2 -> number1 + number2 }
    println(addMethod(2,6))

}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2;
}

fun add2(number1: Int, number2: Int) = number1 + number2

fun add3(number1: Int, number2: Int) = "SAAA"

//可变参数（可变长  蚕食函数）
fun lenMethod(vararg value: Int) {
    for (i in value) {
        println(i)
    }
}

