package com.example.kotlintext.modules.register.inter

import android.content.Context
import com.example.kotlintext.base.IBasePresenter
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse

/**
 * @author YQL
 * @date :2020/7/2 15:22
 * @description:
 */
interface RegisterPresenter: IBasePresenter {

    fun registerWanAndroid(context: Context,userNam: String, password: String, rePassword: String)

    interface OnRegisterListener{

        fun registerSuccess(registerBean: LoginRegisterResponse?)

        fun registerFailed(errorMsg: String?)

    }
}