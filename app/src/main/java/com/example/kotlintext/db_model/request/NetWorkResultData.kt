package com.example.kotlintext.db_model.request

import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import com.xiangxue.kotlinproject.config.Flag
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException

abstract class NetWorkResultData : Callback {
    override fun onFailure(call: Call, e: IOException) {
        Log.e(
            Flag.TAG,
            "===============onFailure:use okhttp network request to exception:${e.message}"
        )
//        requestError("请求是发送了异常，请开发者来com.example.kotlintext.db_model.request.NetWorkResultData找错误原因")

        Handler(Looper.getMainLooper(), object : Handler.Callback {
            override fun handleMessage(p0: Message): Boolean {
                //如果message不为null 就执行。let{requestError(it)} it == message本身
                e.message?.let { requestError(it) }
                return false
            }

        }).sendEmptyMessage(0)
    }

    override fun onResponse(call: Call, response: Response) {
        //在主线 执行
        Handler(Looper.getMainLooper(), Handler.Callback {
            requestSuccess(response)
            false//正常执行下去是false
        }).sendEmptyMessage(0)
    }

    //封装后的成功失败
    abstract fun requestError(info: String)

    abstract fun requestSuccess(result: Response)
}