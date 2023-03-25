package com.example.startupkv

import com.startupkv.androidApp.dto.PostRs
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class PostsService {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    @Throws(Exception::class)
    suspend fun getPosts(): String{
        //Запрос в SpaceX для получения списка запусков
        println("Получение списка всех постов")
        val posts: List<PostRs> =
            httpClient.get("http://192.168.31.200:8190/KV/post").body()
        println("Получены посты:$posts")
        return posts.toString();
    }

//    fun postsToString (): String {
//        return getPosts().toString();
//    }


}