package com.example.kotlintext.net

import android.content.Context
import com.example.kotlintext.LoadingDialog
import com.example.kotlintext.entity.LoginResponseWrapper
import com.xiangxue.kotlinproject.entity.LoginRegisterResponseWrapper
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @author YQL
 * @date :2020/6/24 17:27
 * @description:
 */
abstract class APIResponse<T>(val context: Context) : Observer<LoginRegisterResponseWrapper<T>> {

    private var isShow: Boolean = true

    constructor(context: Context, isShow: Boolean = false) : this(context) {
        this.isShow = isShow
    }

    //成功
    abstract fun success(data: T?)

    //失败
    abstract fun failure(errorMsg: String?)

    //开始
    override fun onSubscribe(d: Disposable) {
        if (isShow) LoadingDialog.show(context)
    }

    //上游流下了的数据
    override fun onNext(t: LoginRegisterResponseWrapper<T>) {
        if (t.data == null) {
            failure("登录失败了，请检查原因：msg:${t.errorMsg}")
        } else {
            success(t.data)
        }
    }

    // 上游流下了的错误
    override fun onError(e: Throwable) {
        LoadingDialog.cancel()
        failure(e.message)
    }

    //停止
    override fun onComplete() {
        LoadingDialog.cancel()
    }
}