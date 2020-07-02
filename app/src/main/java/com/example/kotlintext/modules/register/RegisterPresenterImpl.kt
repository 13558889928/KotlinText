package com.example.kotlintext.modules.register

import android.content.Context
import com.example.kotlintext.modules.register.inter.RegisterPresenter
import com.example.kotlintext.modules.register.inter.RegisterView
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse

/**
 * @author YQL
 * @date :2020/7/2 15:45
 * @description:
 */
class RegisterPresenterImpl(var view: RegisterView?) : RegisterPresenter,RegisterPresenter.OnRegisterListener {

    private val modelImpl = RegisterModelImpl()

    override fun registerWanAndroid(
        context: Context,
        userNam: String,
        password: String,
        rePassword: String
    ) {
        modelImpl.register(context,userNam,password,rePassword,this)
    }

    override fun unAttachView() {
        modelImpl.cancelRequest()
        view = null
    }

    override fun registerSuccess(registerBean: LoginRegisterResponse?) {
        view?.registerSuccess(registerBean)
    }

    override fun registerFailed(errorMsg: String?) {
        view?.registerFailed(errorMsg)
    }


}