package com.example.kotlintext.modules.login.inter

import android.content.Context

/**
 * @author YQL
 * @date :2020/7/2 16:21
 * @description:
 */
interface LoginModel {
    // 取消请求 动作
    fun cancelRequest()

    // 登录
    fun login(
        context: Context,
        username: String,
        password: String,

        // 接口回调，把data 结果，给P层
        onLoginListener: LoginPresenter.OnLoginListener
    )
}