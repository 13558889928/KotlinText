package com.example.lib.kt.s05

/**
 * @author YQL
 * @date :2020/6/27 17:58
 * @description:
 */

fun main() {
    show(true) {
        println("括号结果：$it")
    }
}


//todo loginMethod:(Boolean) -> Unit
//loginMethod 方法名
//（Boolean）方法括号
//-> 方法体  干活
// Unit == void
fun show(isLogin: Boolean, loginMethod: (Boolean) -> Unit) {
    if (isLogin) {
        println("登录成功")
        loginMethod(true)
    } else {
        println("登录失败")
        loginMethod(false)
    }
}