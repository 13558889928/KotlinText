package com.example.kotlintext.text1.simple01


// TODO: 2020/6/22 字符串模版
/**
 * @author YQL
 * @date :2020/6/22 11:08
 * @description:
 */
fun main() {
    //$ 表示一个变量名或者变量值
    //$ $varName 表示变量值
    //￥{varName.fun()} 表示变量方法的返回值

    val name = "张三"
    val age  = 28
    val sex = 'M'
    val info = "ABCDEFG"

    println("name:$name, age:$age,sex:$sex, info:$info")

    //---自己不用关联\n滑囊
    val infoMessage :String = """
        AAAAAAAAAAAAAAAAAA
        bbbbbbbbbbbbbbbbbb
        CCCCCCCCCCCCCCCCCC
        DDDDDDDDDDDDDDDDDD
    """.trimIndent()//没有前置空格
    println(infoMessage)

    val infoMessage2 :String = """
        AAAAAAAAAAAAAAAAAA
        bbbbbbbbbbbbbbbbbb
        CCCCCCCCCCCCCCCCCC
        DDDDDDDDDDDDDDDDDD
    """//有前置空格
    println(infoMessage2)

    val infoMessage3 :String = """
        |AAAAAAAAAAAAAAAAAA
        |bbbbbbbbbbbbbbbbbb
        |CCCCCCCCCCCCCCCCCC
        |DDDDDDDDDDDDDDDDDD
    """.trimMargin("l")//指定去掉某个元素  没空格
    println(infoMessage3)

    //打印特殊字符
    //需求： 显示$99999.99
    val price:String = """
        ${'$'}99999.99
    """.trimIndent()
    println(price)
}