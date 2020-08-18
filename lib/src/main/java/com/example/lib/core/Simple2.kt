package com.example.lib.core

import java.util.concurrent.TimeoutException

val name: String = "Derry"
val age: Int = 0

fun common() {
    println("我是方法")
}

fun main() {
    common().myRun {
        println("AAAA")
        true
        213123132
    }

    myWith(name) {
        length.let { }
    }

    onRun(true) {
        println("执行了")
    }

    onRun(true,{
        println("2222")
    })

    val runnable = Runnable {
        println("我就是runnable任务")
    }
    onRun(true,runnable::run)

}
typealias ddd =Map<String,String>

fun <T, R> T.myRun(m: () -> R): R = m()

fun <T, R> myWith(input: T, mm: T.() -> R): R {
    return input.mm()
}

fun <T, R> T.myLet(mm: T.(T) -> R): R {
    return mm(this)
}

//控制器  如果你的是true 我就执行你  否则不执行
fun onRun(isRun: Boolean, mm: () -> Unit) {
    if (isRun) mm()
}