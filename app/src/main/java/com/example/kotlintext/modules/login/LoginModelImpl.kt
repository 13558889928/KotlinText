package com.example.kotlintext.modules.login

import android.content.Context
import android.util.Log
import com.example.kotlintext.api.WanAndroidAPI
import com.example.kotlintext.modules.login.inter.LoginModel
import com.example.kotlintext.modules.login.inter.LoginPresenter
import com.example.kotlintext.net.APIClient
import com.example.kotlintext.net.APIResponse
import com.xiangxue.kotlinproject.config.Flag
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author YQL
 * @date :2020/7/2 16:24
 * @description:
 */
class LoginModelImpl : LoginModel {
    override fun cancelRequest() {
    }

    override fun login(
        context: Context,
        username: String,
        password: String,
        onLoginListener: LoginPresenter.OnLoginListener
    ) {

        APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)

            // 全部都是RxJava知识了
            .loginAction(username, password)  // 起点  往下流  ”包装Bean“
            .subscribeOn(Schedulers.io()) // 给上面请求服务器的操作，分配异步线程
            .observeOn(AndroidSchedulers.mainThread()) // 给下面更新UI操作，分配main线程
            .subscribe(object: APIResponse<LoginRegisterResponse>(context)
            {
                override fun success(data: LoginRegisterResponse?) {
                    // 成功  data UI
                    Log.e(Flag.TAG, "success: $data")
                    onLoginListener.loginSuccess(data)
                }

                override fun failure(errorMsg: String?) {
                    // 失败 msg UI
                    Log.e(Flag.TAG, "failure: errorMsg:$errorMsg")
                    onLoginListener.loginFialure(errorMsg)
                }

            })
    }
}