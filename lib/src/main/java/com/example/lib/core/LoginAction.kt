package com.example.lib.core

fun main() {
    //用户模拟登录流程
    loginEngine("Derry", "12345") {
        if (it) {
            println("登录成功")
        } else {
            println("登录失败")
        }
    }

    //测试逻辑-》loginText运行后先执行mm()方法
    // 由于mm()方法返回结果是true 打印result = true
    // 运行返回9999
    // 打印方法的返回结果999999

    val count = loginText {
        true
    }
    println("方法的返回结果${count}")
}

//public  fun login(userName:String, userPwd:String ,responseResult:(Boolean) -> Unit){
//    loginEngine(userName, userPwd, responseResult)
//}

//内部去完成登录功能
private fun loginEngine(userName: String, userPwd: String, responseResult: (Boolean) -> Unit) {
    val DB_USER_NAME = "Derry"
    val DB_USER_PWD = "123456"

    if (userName == DB_USER_NAME && userPwd == DB_USER_PWD) {
        // TODO: 2020/8/17 模拟做了很多业务逻辑
        responseResult(true)
    } else {
        // TODO: 2020/8/17 模拟做了很多业务逻辑
        responseResult(false)
    }
}

fun loginText(mm: () -> Boolean): Int {
    val result = mm()
    println("result${result}")
    return 999999999
}

