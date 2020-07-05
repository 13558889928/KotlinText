package com.example.kotlintext

import android.app.Application
import com.example.kotlintext.db.StudentDatabase

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        StudentDatabase.getDatabase(this)
    }
}