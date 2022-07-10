package com.jakmos.hiltguide.domain.interactor

import com.jakmos.hiltguide.domain.UserRepository
import com.jakmos.hiltguide.domain.model.User
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend fun run(): List<User> =
        userRepository.getUser()
}
