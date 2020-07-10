package com.example.kotlintext.modules.collect

import com.example.kotlintext.db.Student
import com.example.kotlintext.modules.collect.inter.CollectPresenter
import com.example.kotlintext.modules.collect.inter.CollectView

class CollectPresenterImpl(var view: CollectView?) : CollectPresenter,
    CollectPresenter.OnCollectResponseListener,
    CollectPresenter.OnCollectListener {

    var collectModelImpl: CollectModelImpl = CollectModelImpl()

    override fun requestInsert(vararg student: Student) {
        collectModelImpl.requestInsert(this, *student)
    }

    override fun requestUpdate(vararg student: Student) {
        collectModelImpl.requestUpdate(this, *student)
    }

    override fun requestDelete(vararg student: Student) {
        collectModelImpl.requestDelete(this, *student)
    }

    override fun requestDeleteAll() {
        collectModelImpl.requestDelete(this)
    }

    override fun requestQueryAll() {
        collectModelImpl.requestDelete(this)
    }

    override fun unAttachView() {
        view = null
    }

    override fun showResultSuccess(result: List<Student>?) {
        view?.showResultSuccess(result)
    }

    override fun showIUD(iudResult: Boolean) {
        view?.showResult(iudResult)
    }
}