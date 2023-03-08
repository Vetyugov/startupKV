package com.startupkv.androidApp.dto

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class UserInfoRs (
    @SerialName("id")
    private val id: Long,
    @SerialName("nickname")
    private val nickname: String,
    @SerialName("avatar")
    private val avatar: ByteArray
)