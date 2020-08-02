package com.example.kotlintext.db_model.request

import com.xiangxue.kotlinproject.config.Flag
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request

object RequestAPI :IRequest{


//    companion object{
//        fun instanceRequest():IRequest = RequestAPI()
//    }

    //无参
    override fun instanceRequestAction(url: String, requestData: NetWorkResultData) {
        commonOKHttpRequestAction(url,requestData,"")
    }

    //一个参数
    override fun instanceRequestAction(url: String, value: String, requestData: NetWorkResultData) {
        commonOKHttpRequestAction(url,requestData,value)
    }

    //两个参数
    override fun instanceRequestAction(
        url: String,
        value1: String,
        value2: String,
        requestData: NetWorkResultData
    ) {
       commonOKHttpRequestAction(url,requestData,value1,value2)
    }


    //map
    override fun instanceRequestAction(
        url: String,
        requestData: NetWorkResultData,
        parameter: Map<String, String>
    ) {

    }

    //可变参数--->具体 okHttp执行
    private fun commonOKHttpRequestAction(url:String ,resultData:NetWorkResultData,vararg  values: String){
        //okHttp
        //1.创建一个okHttpClient对象
        val okHttpClient = OkHttpClient()

        //2.构建参数的body MultipartBody.FORM 表单形式
        val builder:MultipartBody.Builder  = MultipartBody.Builder().setType(MultipartBody.FORM);

        //参数根据可变参数的 数量变化而变化
        for (value in values) {
            //2.2封装参数
            builder.addFormDataPart(Flag.PART,value)
        }

        //3.构建一个请求 post 提交里边的是参数的builder url()请求路径
        val request:Request = Request.Builder().url(url)
            .post(builder.build()).build()

        //4.发送一个请求 给服务器
        okHttpClient.newCall(request).enqueue(resultData)
    }
}