package com.startupkv.androidApp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform