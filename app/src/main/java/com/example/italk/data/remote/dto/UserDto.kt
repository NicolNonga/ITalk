package com.example.italk.data.remote.dto

import com.example.italk.domain.model.User

data class UserDto(
    val id: String,
    val name: String,
    val email: String,
    val profilePictureUrl: String? = null
) {
    fun toUser(): User {
        return User(
            id = id,
            name = name,
            email = email,
            profilePictureUrl = profilePictureUrl
        )
    }
}
