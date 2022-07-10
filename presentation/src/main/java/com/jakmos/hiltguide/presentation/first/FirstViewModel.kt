package com.jakmos.hiltguide.presentation.first

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakmos.hiltguide.domain.interactor.GetUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val getUsersUseCase: GetUserUseCase
) : ViewModel() {

    fun print() = viewModelScope.launch {
        val users = getUsersUseCase.run()
        Log.v("KUBA", "Users: $users")
    }
}
