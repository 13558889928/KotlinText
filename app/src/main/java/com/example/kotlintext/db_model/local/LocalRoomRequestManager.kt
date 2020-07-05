package com.example.kotlintext.db_model.local

import com.example.kotlintext.db.Student
import com.example.kotlintext.db.StudentDao
import com.example.kotlintext.db.StudentDatabase

class LocalRoomRequestManager :ILocalRequest,IDatabaseRequest{

    /** TODO ********************** 下面这一系列都是 本地相关的 ************************/
    var studentDao: StudentDao ?= null

    init {
        val studentDatabase: StudentDatabase? = StudentDatabase.getDatabase()
        studentDao = studentDatabase?.getStudentDao()
    }

    //单例模式而已
    companion object{
        var INSTANCE: LocalRoomRequestManager ?= null

        fun getInstance(): LocalRoomRequestManager{
            if(INSTANCE == null){
                synchronized(LocalRoomRequestManager::class){
                    if(INSTANCE == null){
                        INSTANCE = LocalRoomRequestManager()
                    }
                }
            }
            return INSTANCE!!
        }
    }

    override fun insertStudents(vararg student: Student) {
        studentDao?.insertStudents(*student)
    }

    override fun updateStudents(vararg student: Student) {
        studentDao?.updateStudents(*student)
    }

    override fun deleteStudents(vararg student: Student) {
        studentDao?.deleteStudents(*student)
    }

    override fun deleteAllStudents() {
        studentDao?.deleteAllStudents()
    }

    override fun queryAllStudents(): List<Student>? {
        return studentDao?.queryAllStudents()
    }
}