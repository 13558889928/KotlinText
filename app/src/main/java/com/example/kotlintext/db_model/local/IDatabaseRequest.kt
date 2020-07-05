package com.example.kotlintext.db_model.local

import com.example.kotlintext.db.Student

/**
 * 为了扩展这样写
 * 数据库获取标准接口（在仓库里），也就是数据库的数据读取（包括数据库数据，等）
 * 只为LocalRoomRequestManager服务
 */
interface IDatabaseRequest {
    fun insertStudents(vararg student: Student)
    
    fun updateStudents(vararg student: Student)
    
    fun deleteStudents(vararg student: Student)
    
    fun deleteAllStudents()
    
    fun queryAllStudents():List<Student>?

    // TODO: 2020/7/5  可扩展cv+fr 
}