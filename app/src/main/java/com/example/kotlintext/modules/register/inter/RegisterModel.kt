package com.example.kotlintext.modules.register.inter

import android.content.Context

/**
 * @author YQL
 * @date :2020/7/2 15:22
 * @description:
 */
interface RegisterModel {

    fun cancelRequest()

    fun register(
        context: Context,
        userNam: String,
        password: String,
        rePassword: String,
        callback: RegisterPresenter.OnRegisterListener
    )

}