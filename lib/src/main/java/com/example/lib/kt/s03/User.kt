package com.example.lib.kt.s03

/**
 * @author YQL
 * @date :2020/6/27 17:07
 * @description:
 */
data class User (val id:Int,val name:String ,val sex: Char)

fun main() {
    val u = User(1,"Derry",'M')
    val (v1,name,v3) = u.copy()
}