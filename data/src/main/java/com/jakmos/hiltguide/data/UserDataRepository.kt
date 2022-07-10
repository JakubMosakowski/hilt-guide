package com.jakmos.hiltguide.data

import com.jakmos.hiltguide.data.db.Database
import com.jakmos.hiltguide.domain.UserRepository
import com.jakmos.hiltguide.domain.model.User
import javax.inject.Inject

internal class UserDataRepository @Inject constructor(
    private val database: Database
) : UserRepository {

    override suspend fun getUser(id: String): User? = database.getUser(id)
}
