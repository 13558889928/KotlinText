package com.example.kotlintext.modules.register

import android.content.Context
import com.example.kotlintext.api.WanAndroidAPI
import com.example.kotlintext.modules.register.inter.RegisterModel
import com.example.kotlintext.modules.register.inter.RegisterPresenter
import com.example.kotlintext.net.APIClient
import com.example.kotlintext.net.APIResponse
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author YQL
 * @date :2020/7/2 15:50
 * @description:
 */
class RegisterModelImpl: RegisterModel {
    override fun cancelRequest() {
    }

    override fun register(
        context: Context,
        userNam: String,
        password: String,
        rePassword: String,
        callback: RegisterPresenter.OnRegisterListener
    ) {
        // 网络模型
        APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)
            .registerAction(userNam, password, rePassword)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : APIResponse<LoginRegisterResponse>(context) {
                override fun success(data: LoginRegisterResponse?) {
                    callback.registerSuccess(data)
                }

                override fun failure(errorMsg: String?) {
                    callback.registerFailed(errorMsg)
                }

            })
    }
}