package com.example.italk.domain.repository

import com.example.italk.domain.model.User

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<User>
}
