package com.jakmos.hiltguide.data.di

import com.jakmos.hiltguide.data.UserDataRepository
import com.jakmos.hiltguide.domain.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(
        userRepository: UserDataRepository
    ): UserRepository
}
