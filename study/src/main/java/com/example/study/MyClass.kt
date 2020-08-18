package com.example.study

import java.util.*

class MyClass {


}
typealias name = Map<String, String>

val number = 1_000_1


fun map() {
    val map = mapOf(1 to "one", 2 to "two")
    println(map.mapValues { (key, value) -> "$key->$value" })

    map.forEach { _, value -> println("$value!") }
}

data class Person(val name: String, val age: Int) {
    val isAdult get() = age >= 20//属性类型自动推断为'Boolean'
}

fun needAnswer() = Random().nextBoolean()

val answer by lazy {
    println("calculating the answer..")
    42
}

class Block {
    lateinit var content: String
}

fun Block.copy() = Block().also {
    it.content = this.content
}

class ImmutablePropertyBag(map: Map<String, Any>) {
    private val mapCopy = map.toMap();
}

fun sum(a: Int, b: Int): Int {
    val a: Int = 1   //立即赋值
    val b = 2   //变量类型自动推断为Int类型
    val c: Int   //没有初始化语句时必须明确指定类型
    c = 3    //延迟赋值

    var x = 5
    x += 1


    return a + b
}

fun ddd() {
    var a = 1
    //在字符串模版中使用简单的变量名称
    val s1 = "a is $a"
    var s2 = "${s1.replace("is", "was")},but now is$a"
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

//fun sum(a: Int, b: Int) = a + b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun main() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }


    for (i in 1..100){}//闭区间：包括1oo
    for(i in 1 until 100)//半开(half-open)区间：不包括1oo
    for (x in 2..10 step 2){ }

}

data class Customer(val name: String, val email: String)

fun foo(a: Int = 0, b: String = "") {}


