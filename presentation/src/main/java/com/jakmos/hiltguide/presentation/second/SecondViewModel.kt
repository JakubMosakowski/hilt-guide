package com.jakmos.hiltguide.presentation.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakmos.hiltguide.domain.KubaLogger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val args: SecondFragmentArgs,
    private val logger: KubaLogger
) : ViewModel() {

    fun loadUser() = viewModelScope.launch {
        logger.log("User: ${args.provideUser()}")
    }
}
