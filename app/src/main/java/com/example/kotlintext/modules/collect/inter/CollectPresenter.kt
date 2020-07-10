package com.example.kotlintext.modules.collect.inter

import com.example.kotlintext.base.IBasePresenter
import com.example.kotlintext.db.Student

interface CollectPresenter: IBasePresenter {

    fun requestInsert(vararg student: Student)
    fun requestUpdate(vararg student: Student)
    fun requestDelete(vararg student: Student)
    fun requestDeleteAll()
    fun requestQueryAll()

    interface OnCollectResponseListener{
        fun showResultSuccess(result: List<Student>?)
    }

    interface OnCollectListener{
        fun showIUD(iudResult: Boolean)
    }
}