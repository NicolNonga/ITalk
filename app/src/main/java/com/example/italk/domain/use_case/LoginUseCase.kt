package com.example.italk.domain.use_case

import com.example.italk.domain.repository.AuthRepository

class LoginUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String) = repository.login(email, password)
}
