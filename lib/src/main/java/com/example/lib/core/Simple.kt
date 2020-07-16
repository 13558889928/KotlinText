package com.example.lib.core

/**
 * @author YQL
 * @date :2020/7/16 11:56
 * @description:
 */
fun main() {

    // （） -> Unit 空参函数 并且没有返回值  函数名= method01

//    var method01: () -> Unit
//    method01()//不能调用 没有具体的实现

//    var method02: (Int, Int) -> Int
//    method02(9,9)

//    var method03: (String, Double) -> Any?
//    method03("derry",111.04)

//    var method04: (Int, Double, Long, String?) -> Boolean
//    method04(111,11.22,111,null)

//    var method05: (Int, Int) -> Int
//    method05(9,9)

    //:(形参类型)
    // = {具体详情}

    var m06: (Int, Int) -> Int = { number1, number2 -> number1 + number2 }
    println("m06${m06(1, 2)}")

    var m07 = { number1: Int, number2: Int -> number1 + number2 }
    println("m07${m07(1, 2)}")

    var m08: (String, String) -> Unit = { aString, bString -> println("a$aString,b$bString") }
    m08("三款手机", "ds")

    var m09: (String) -> String = { s -> s }
    println("m09${m09("skdjgklsjd")}")

    var m10: (Int) -> Unit = {
        when (it) {
            1 -> println("你是一")
            in 20..30 -> println("你是20到30")
            else -> {
                println("其他数字")
            }
        }
    }
    m10(22)
    m10(6)

    var m11: (Int, Int, Int) -> Unit = { a, b, c -> println("a$a,b$b,c$c") }
    m11(1, 2, 3)

    var m12 = { println("大是大非") }
    m12()

    var m13 = { sex: Char -> if (sex == 'c') "是宽带连接" else "dsgsd" }
    println("m13${m13('2')}")

    //覆盖操作
    var m14 = { number: Int -> println("说我是m14 我的值：${number}") }
    m14 = { println("覆盖 我的值：$it") }
    m14(99)

    //需求：我想打印 并且我还想返回值，啥都想要
    var m15 = { number: Int ->
        println("我想打印 $number")
        number+ 1000//^lambda 有这个标记意味着可以做多重操作
    }

    println("m15：${m15(88)}")

}