package com.startupkv.androidApp.dto

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class PostRs(
    @SerialName("id")
    private val id: Long,
    @SerialName("location")
    private val location: String? = null,
    @SerialName("desc")
    private val desc: String? = null,
    @SerialName("images")
    private val images: List<ImageDTO>? = null,
    @SerialName("user")
    private val user: UserInfoRs,
    @SerialName("createTime")
    private val createTime: Instant
)