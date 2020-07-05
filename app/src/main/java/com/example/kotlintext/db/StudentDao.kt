package com.example.kotlintext.db

import androidx.room.*

@Dao
interface StudentDao {
    @Insert
    fun  insertStudents(vararg students: Student)

    @Update
    fun updateStudents(vararg students: Student)

    //根据条件删除
    @Delete
    fun deleteStudents(vararg students: Student)

    //删除全部
    @Query("delete from student")
    fun deleteAllStudents()

    //查询全部
    @Query("select * from student order by id desc")
    fun queryAllStudents(): List<Student>
}