package com.example.lib.kt.s05

/**
 * @author YQL
 * @date :2020/6/27 17:58
 * @description:
 */

fun main() {
    show(true) {
        "dddd"
    }
}


// TODO: 2020/6/27 loginMethod: (Boolean) ->Unit 
/**
 * loginMethod: () ->Unit
 *
 * loginMethod 方法名
 *  () 方法的那个括号
 *   -> 方法体
 *   Unit == void
 */
fun show(isLogin: Boolean, loginMethod: (Boolean)-> String) {
    if (isLogin) {
        println("登录成功")
        val str = loginMethod(isLogin)
        println(str)//->dddd
    } else {
        loginMethod
        println("登录失败")
        loginMethod(isLogin)
    }

}