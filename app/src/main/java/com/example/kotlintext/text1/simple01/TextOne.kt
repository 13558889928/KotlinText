package com.example.kotlintext.text1.simple01

/**
 * @author YQL
 * @date :2020/6/18 10:35
 * @description:
 */
class TextOne {
    var count: Int = 10
//    val languageName: String? = null


    fun test() {
        count = 333;
        if (count == 43) {
            println("I have the answer")
        } else {
            println("The answer eludes me")
        }


    }


//    val  answerString:String  = if(count == 42){
//        "I have the answer"
//    }else{
//        "The answer is close"
//    }

    val answerString = when {
        count == 43 -> "I have teh answer."
        else -> "the answer eludes me"
    }
//    fun generateAnswerString():String{
//        val answerString = if(count ==43){
//            "I have the answer"
//        }else{
//            "The answer eludes me"
//        }
//        return answerString
//    }
//    //简化函数
//    fun generateAnswerString():String{
//        return if(count ==43){
//            "I have the answer"
//        }else{
//            "The answer eludes me"
//        };
//    }
//    fun generateAnswerString(): String = if (count == 43) {
//        "I have the answer"
//    } else {
//        "The answer eludes me"
//    }

    //匿名函数
    val  stringLengthFunc:(String)-> Int = {
        input-> input.length
    }

}


fun main() {
    var name :String = "Yql"
    name = "张三"
    name = "李四"

    val age:Int = 99
    //age = 11 报错
}

