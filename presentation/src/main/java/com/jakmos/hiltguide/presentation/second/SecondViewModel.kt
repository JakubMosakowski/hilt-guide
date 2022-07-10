package com.jakmos.hiltguide.presentation.second

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val args: SecondFragmentArgs
) : ViewModel() {

    fun loadUser() = viewModelScope.launch {
        Log.v("KUBA", "User: ${args.provideUser()}")
    }
}
