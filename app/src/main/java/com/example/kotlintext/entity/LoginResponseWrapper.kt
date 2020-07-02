package com.example.kotlintext.entity

/**
 * @author YQL
 * @date :2020/6/24 11:58
 * @description:
 */
data class LoginResponseWrapper<T>(val data: T,val  errorCode: Int ,val errorMsg: String)