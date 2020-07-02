package com.example.common.utils

import android.os.Handler
import android.os.Looper
import android.os.Message

/**
 * @author YQL
 * @date :2020/6/27 11:56
 * @description:
 */
fun main() {

    Handler(Looper.getMainLooper(), object : Handler.Callback {
        override fun handleMessage(p0: Message): Boolean {
            TODO("Not yet implemented")
        }

    })

    Handler(Looper.getMainLooper(), Handler.Callback { true })

    Thread{

    }.start()
}