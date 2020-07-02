package com.example.kotlintext.text1.simple03

/**
 * @author YQL
 * @date :2020/6/22 15:48
 * @description:
 */
fun main() {
    val number1: Int = 99999
    val number2: Int = 88888

    //表达式 比较大小 最大值
    val maxvalue = if (number1 > number2) number1 else number2
    println(maxvalue)

    val number = 5
    when (number) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
    }

    when (5) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
    }

    when (5) {
        in 1..100 -> println("1")
        in 200..500 -> println("2")
        3 -> println("3")
        4 -> println("4")
        else -> println("其他")
    }

    val  number222 = 3
    val result = when(number222){
        111 ->{

        }
        222->{

        }
        else -> "123"
    }
}