package com.example.lib.kt.s03

/**
 * @author YQL
 * @date :2020/6/27 17:20
 * @description:
 */
class Student(var id: Int, var name: String, var sex: Char) {

    operator fun component1(): Int = id

    operator fun component2(): String = name

    operator fun component3(): Char = sex

    operator fun component4(): String  = "SLKDJSALKSADG"

}

fun main() {
    //手写copy函数进行解构

    val student = Student(1111,"sdlk",'d')

    val(v1,v2,v3,v4) = student
    println("v1:$v1,v2:$v2,v3:$v3,v4:$v4,")
}