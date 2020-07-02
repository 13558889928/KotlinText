package com.example.kotlintext.text1.simple04

/**
 * @author YQL
 * @date :2020/6/22 17:53
 * @description:
 */

fun main() {
    ttt@ for (i in 1..20) {
        for (j in 1..20) {
            println("i${i},j${j}")
            if (i == 5)
//                break j循环给break
                break@ttt  //i循环 给breaK
        }
    }

    // TODO: 2020/6/23
    var items = listOf<String>("李四", "张三", "王五")
    for (item in items) {
        println(item)
    }

    items.forEach { println(it) }

    for (index in items.indices) {
        println("下标：$index,对应的值：${items[index]}")
    }
}

//自带标签
class Derry {
    val i = "aaa"

    fun show() {
        println(i)
        println(this.i)
        println(this@Derry.i)
    }
}