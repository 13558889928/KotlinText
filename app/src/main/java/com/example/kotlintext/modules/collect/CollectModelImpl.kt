package com.example.kotlintext.modules.collect

import com.example.kotlintext.db.Student
import com.example.kotlintext.db_model.local.LocalRoomRequestManager
import com.example.kotlintext.modules.collect.inter.CollectModel
import com.example.kotlintext.modules.collect.inter.CollectPresenter

class CollectModelImpl: CollectModel {
    override fun requestInsert(
        listener: CollectPresenter.OnCollectListener,
        vararg student: Student
    ) {
        LocalRoomRequestManager.getInstance().insertStudents(*student)
        listener.showIUD(true)
    }

    override fun requestUpdate(
        listener: CollectPresenter.OnCollectListener,
        vararg student: Student
    ) {
        LocalRoomRequestManager.getInstance().updateStudents(*student)
        listener.showIUD(true)
    }

    override fun requestDelete(
        listener: CollectPresenter.OnCollectListener,
        vararg student: Student
    ) {
        LocalRoomRequestManager.getInstance().deleteStudents(*student)
        listener.showIUD(true)
    }

    override fun requestDeleteAll(listener: CollectPresenter.OnCollectListener) {
        LocalRoomRequestManager.getInstance().deleteAllStudents()
        listener.showIUD(true)
    }

    override fun requestQueryAll(listener: CollectPresenter.OnCollectResponseListener) {
        val result = LocalRoomRequestManager.getInstance().queryAllStudents()
        listener.showResultSuccess(result)
    }

}