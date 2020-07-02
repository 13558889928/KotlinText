package com.example.kotlintext.modules.register.inter

import com.xiangxue.kotlinproject.entity.LoginRegisterResponse

/**
 * @author YQL
 * @date :2020/7/2 15:21
 * @description:
 */
interface RegisterView {

    // 成功 失败 显示 到 Activty

    fun registerSuccess(registerBean: LoginRegisterResponse?)

    fun registerFailed(errorMsg: String?)

}