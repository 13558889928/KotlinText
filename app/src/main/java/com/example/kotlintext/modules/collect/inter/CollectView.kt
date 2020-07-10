package com.example.kotlintext.modules.collect.inter

import com.example.kotlintext.db.Student

interface CollectView {

    fun showResultSuccess(result: List<Student>?)

    fun showResult(result: Boolean)
}