package com.example.kotlintext.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * @author YQL
 * @date :2020/7/2 17:02
 * @description:
 */
abstract class BaseFragment<T : IBasePresenter> : Fragment() {

    lateinit var p: T
    lateinit var activity: AppCompatActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as AppCompatActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        p = getPresenter()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        createOK()
    }

    abstract fun getPresenter(): T

    override fun onDestroy() {
        super.onDestroy()
        recycle()
    }

    abstract fun createOK()
    abstract fun recycle()
}