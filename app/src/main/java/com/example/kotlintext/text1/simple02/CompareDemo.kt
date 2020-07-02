package com.example.kotlintext.text1.simple02

/**
 * @author YQL
 * @date :2020/6/22 15:34
 * @description:
 */
fun main() {
    val name1: String = "张三"
    val name2: String = "张三"

    //---- 比较值本身
    //等价java的equals
    println(name1.equals(name2))
    println(name1 == name2)

    //---- 比较对象地址
    val test: Int? = 1000
    val test2: Int? = 1000
    println(test === test2)
}