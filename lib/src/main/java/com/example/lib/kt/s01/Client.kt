package com.example.lib.kt.s01

import com.example.lib.java.s01.JavaStudent
import com.example.lib.java.cb.JavaCallback
import com.example.lib.java.cb.JavaManager
import com.example.lib.kt.kb.KtCallback
import com.example.lib.kt.kb.KtManager
import kotlin.reflect.KClass

/**
 * @author YQL
 * @date :2020/6/27 11:17
 * @description:
 */
class Client {
}

fun main() {
    //解决调用java 中属于kotlin关键字问题
    println(JavaStudent.`in`)

    //调用java函数  String! 由于是！ 你最好 var str: String? 处理空指针异常（面试题）
    val str: String? = JavaStudent().string
    println(str?.length)

    showClass(JavaStudent::class.java)
    showClass2(KtStudent::class)

    // TODO: 2020/6/27 kt 使用 java cb
    //第一种写法
    JavaManager().setCallback {
        println(it)
    }
    //第二种写法
    JavaManager().setCallback(object :JavaCallback{
        override fun show(info: String?) {
        }
    })
    //第三种写法
    val callback = JavaCallback { info: String? -> println(info)}
    JavaManager().setCallback(callback)

    // TODO: 2020/6/27 kt 使用 kt cb
    //kt 不能像java一样的写法
    KtManager().setCallback(object :KtCallback{
        override fun show(name: String) {

        }
    })

    //实战列子
//    Handler(Looper.getMainLooper(), object : Handler.Callback {
//        override fun handleMessage(p0: Message): Boolean {
//            TODO("Not yet implemented")
//        }
//
//    })
//
//    Handler(Looper.getMainLooper(), Handler.Callback { true })
//
//    Thread{
//
//    }.start()
}

//形参里边 java
fun showClass(clazz: Class<JavaStudent>){

}

//全部都用 kt
fun showClass2(clazz: KClass<KtStudent>){

}