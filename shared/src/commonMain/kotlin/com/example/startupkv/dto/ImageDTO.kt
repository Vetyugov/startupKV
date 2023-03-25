package com.startupkv.androidApp.dto

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class ImageDTO (
    @SerialName("imageId")
    private val imageId: Long,
    @SerialName("image")
    private val image: ByteArray
)