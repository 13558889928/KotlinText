package com.example.kotlintext.modules.login.inter

import com.xiangxue.kotlinproject.entity.LoginRegisterResponse

/**
 * @author YQL
 * @date :2020/7/2 16:21
 * @description:
 */
interface LoginView {

    fun loginSuccess(loginBean: LoginRegisterResponse?)

    fun loginFialure(erroeMsg: String  ?)
}