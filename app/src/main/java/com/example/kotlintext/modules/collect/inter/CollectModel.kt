package com.example.kotlintext.modules.collect.inter

import com.example.kotlintext.db.Student

interface CollectModel {

    fun requestInsert(listener: CollectPresenter.OnCollectListener,vararg student: Student)
    fun requestUpdate(listener: CollectPresenter.OnCollectListener,vararg student: Student)
    fun requestDelete(listener: CollectPresenter.OnCollectListener,vararg student: Student)
    fun requestDeleteAll(listener: CollectPresenter.OnCollectListener)

    fun requestQueryAll(listener: CollectPresenter.OnCollectResponseListener)
}