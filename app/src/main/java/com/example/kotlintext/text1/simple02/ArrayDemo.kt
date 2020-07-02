package com.example.kotlintext.text1.simple02

/**
 * @author YQL
 * @date :2020/6/22 15:39
 * @description:
 */
//数组
fun main() {
    // 第一种形式
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    for (number in numbers) {
        println(number)
    }

    //第二种形式
    val numbers2 = Array(20,{value:Int -> (value +100001)})
    for (function in numbers2) {
        println(function)
    }

    val numbers3 = Array(20) { value:Int -> value +100001}
    for (function in numbers3) {
        println(function)
    }

    val numbers4 = Array(20) { value:Int -> (value +100001)}
    for (function in numbers4) {
        println(function)
    }
}