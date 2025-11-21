package com.example.italk.data.repository

import com.example.italk.data.remote.AuthApi
import com.example.italk.data.remote.dto.LoginRequest
import com.example.italk.domain.model.User
import com.example.italk.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val api: AuthApi
) : AuthRepository {

    override suspend fun login(email: String, password: String): Result<User> {
        return try {
            val loginRequest = LoginRequest(email, password)
            val userDto = api.login(loginRequest)
            Result.success(userDto.toUser())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
