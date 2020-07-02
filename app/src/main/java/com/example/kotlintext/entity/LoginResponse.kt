package com.example.kotlintext.entity

/**
 * @author YQL
 * @date :2020/6/24 13:43
 * @description:
 */

// 通配符Java?   ====   kt *
// String ? 允许服务器字段是 null
data class LoginResponse(
    val admin: Boolean,
    val chapterTops: List<*>,
    val collectIds: List<*>,
    val email: String?,
    val icon: String?,
    val id: String?,
    val nickname: String?,
    val password: String?,
    val publicName: String?,
    val token: String?,
    val type: Int,
    val username: String?

)