package com.example.kotlintext.text1.simple01

// TODO: 2020/6/22  null检查机制
/**
 * @author YQL
 * @date :2020/6/22 11:43
 * @description:
 */

fun main() {
    //kotlin 的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，
    //有两种处理方式，字段后加！！像java一样抛出空异常，另一种字段后加？
    var info: String? = null
//    println(info?.length)//第一种补救： ?  若果info是null，就不执行.length

//    println(info!!.length)//第二种补救: !! 我自己负责info 不会为null == Java 会报空指针（不管是不是null 正常执行）

    if(info != null){
        println(info.length)
    }
    textMethod("ddd")
}

//： Int? === 允许返回null
fun textMethod(name: String): Int?{
    if(name == "ddd"){
        return 99999;
    }
    return null
}