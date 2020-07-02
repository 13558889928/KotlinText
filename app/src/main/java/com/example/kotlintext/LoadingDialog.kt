package com.example.kotlintext

import android.app.Dialog
import android.content.Context

/**
 * @author YQL
 * @date :2020/6/24 17:34
 * @description:
 */
//object不能含有构造函数   LoadingDialog.show  不是LoadingDialog().show  没有柱构造就没有次构造
object LoadingDialog {
    //内部生成的时候  根据INSTANCE 看起来感觉是静态的 因为可以LoadingDialog.show  java中调用是LoadingDialog.INSTANCE.show1()
    fun show1() {

    }

    //整整的static  java中调用是LoadingDialog.show1()
    @JvmStatic
    fun show2() {
    }

    private var dialog: Dialog? = null

    fun show(context: Context) {
        dialog = Dialog(context)
        dialog?.setContentView(R.layout.dialog_loading)
        dialog?.setCancelable(false)
        dialog?.setCanceledOnTouchOutside(false)
        // .....
        dialog?.show()
    }

    fun cancel() {
        dialog?.cancel()
    }
}