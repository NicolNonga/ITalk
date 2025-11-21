package com.example.italk.data.remote

import com.example.italk.data.remote.dto.LoginRequest
import com.example.italk.data.remote.dto.UserDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): UserDto

    companion object {
        const val BASE_URL = "https://your-api-url.com/api/"
    }
}
