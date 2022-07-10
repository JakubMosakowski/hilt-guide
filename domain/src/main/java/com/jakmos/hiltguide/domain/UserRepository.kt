package com.jakmos.hiltguide.domain

import com.jakmos.hiltguide.domain.model.User

interface UserRepository {

    suspend fun getUser(id: String): User?
}
