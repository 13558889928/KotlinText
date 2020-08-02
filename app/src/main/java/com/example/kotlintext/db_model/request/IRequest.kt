package com.example.kotlintext.db_model.request

interface IRequest {

    // TODO: 2020/8/2 下面这一系列都是network相关的

    fun instanceRequestAction(url: String, requestData: NetWorkResultData)

    fun instanceRequestAction(url: String, value: String, requestData: NetWorkResultData)

    fun instanceRequestAction(
        url: String,
        value1: String,
        value2: String,
        requestData: NetWorkResultData
    )

    //map 参数
    fun instanceRequestAction(
        url: String,
        requestData: NetWorkResultData, parameter: Map<String, String>
    )
}