package com.example.lib.core

private val names: String = "Derry"
private val ages: Int = 0

fun commonOk() {
    println("我是方法")
}

fun main() {
    commonOk().muRunOk {
        true
    }

    names.muRunOk {
        false
    }
}

//T.() 给万能类型 增加匿名函数  只不过这个匿名函数 在高阶函数
// () 就是高阶函数
fun <T> T.muRunOk(mm: T.() -> Boolean) {
    mm()
}