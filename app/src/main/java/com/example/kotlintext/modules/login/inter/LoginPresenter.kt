package com.example.kotlintext.modules.login.inter

import android.content.Context
import com.example.kotlintext.base.IBasePresenter
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse

/**
 * @author YQL
 * @date :2020/7/2 16:21
 * @description:
 */
interface LoginPresenter : IBasePresenter{

    // 登录
    fun loginAction(context: Context, username: String, password: String)

    // 监听回调
    interface OnLoginListener {

        fun loginSuccess(loginBean: LoginRegisterResponse?)

        fun loginFialure(erroeMsg: String  ?)

    }
}