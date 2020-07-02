package com.example.kotlintext.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author YQL
 * @date :2020/7/2 15:08
 * @description:
 */
abstract class BaseActivity<T> : AppCompatActivity() where T : IBasePresenter {

    lateinit var presenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = createPresenter()
    }

    abstract fun createPresenter(): T

    abstract fun recycler()

    override fun onDestroy() {
        super.onDestroy()
        recycler()
    }
}