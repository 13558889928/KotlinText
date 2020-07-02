package com.example.kotlintext.api

import com.example.kotlintext.entity.LoginResponse
import com.example.kotlintext.entity.LoginResponseWrapper
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse
import com.xiangxue.kotlinproject.entity.LoginRegisterResponseWrapper
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * @author YQL
 * @date :2020/6/24 10:47
 * @description:
 */
interface WanAndroidAPI {
    /**
     * 登录Api
     */

    @POST("user/login")
    @FormUrlEncoded
    fun loginAction(
        @Field("username") username: String,
        @Field("password") password: String)
    :Observable<LoginRegisterResponseWrapper<LoginRegisterResponse>>


    /**
     * 注册的API
     */
    @POST("/user/register")
    @FormUrlEncoded
    fun registerAction(@Field("username") username: String,
                       @Field("password") password: String,
                       @Field("repassword") repassword: String)
            : Observable<LoginRegisterResponseWrapper<LoginRegisterResponse>> // 返回值
}