package com.example.kotlintext.text1.simple01


/**
 * @author YQL
 * @date :2020/6/22 14:31
 * @description:
 */

// TODO: 2020/6/22 区间
fun main() {

    //1 到 9
    for (i in 1..9){
        println(i)
    }

    //不会输出
    for (i in 9..1){
        println(i)
    }

    //大道小
    for (i in 9 downTo 1){
        print(i)
    }

    val content: String = "是看到两个"

    for (char in content){
        println(char)
    }

    //用区间做判断
    val value = 88;
    if(value in 1..100){
        println("包含1到100")
    }

    //指定步长
    for (i in 1..20 step 2){
        println(i)
    }

    //排除
    for (i in 1 until 10){
        print(i)
    }
}