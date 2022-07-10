package com.jakmos.hiltguide.presentation.second

import androidx.lifecycle.SavedStateHandle
import com.jakmos.hiltguide.domain.interactor.GetUserUseCase
import com.jakmos.hiltguide.domain.model.User
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class SecondFragmentArgs @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val getUserUseCase: GetUserUseCase
) {

    suspend fun provideUser(): User? {
        val userId: String = savedStateHandle["userId"]
            ?: throw IllegalStateException("Second fragment needs to have userId argument!")

        return getUserUseCase.run(userId)
    }
}
