package com.example.lib.kt.s04

import java.io.File

/**
 * @author YQL
 * @date :2020/6/27 17:29
 * @description:
 */

fun main() {
    val stu = Student()
        stu.add(1,2)

    val file = File("")
    file.readText()
    file.show()
}

//扩展函数
fun Student.add(na: Int, nab: Int) {
    println("结果：${na + nab}")
}

fun  File.show(){
    println("给 java file 增加 扩展函数")
}

fun File.appendText(){
    println("给 java file 增加 扩展函数 的 同名函数")
}