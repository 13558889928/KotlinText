package com.example.kotlintext.modules.login

import android.content.Context
import com.example.kotlintext.modules.login.inter.LoginPresenter
import com.example.kotlintext.modules.login.inter.LoginView
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse

/**
 * @author YQL
 * @date :2020/7/2 16:23
 * @description:
 */
class LoginPresenterImpl(var view: LoginView?) : LoginPresenter, LoginPresenter.OnLoginListener {

    val modelImpl = LoginModelImpl()

    override fun loginAction(context: Context, username: String, password: String) {
        modelImpl.login(context, username, password, this)
    }

    override fun unAttachView() {
        modelImpl.cancelRequest()
        view = null
    }

    override fun loginSuccess(loginBean: LoginRegisterResponse?) {
        view?.loginSuccess(loginBean)
    }

    override fun loginFialure(erroeMsg: String?) {
        view?.loginFialure(erroeMsg)
    }
}