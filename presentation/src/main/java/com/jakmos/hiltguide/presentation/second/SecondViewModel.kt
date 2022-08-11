package com.jakmos.hiltguide.presentation.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jakmos.hiltguide.domain.logger.CustomLogger
import com.jakmos.hiltguide.domain.logger.DebugLoggerQualifier
import com.jakmos.hiltguide.presentation.second.router.SecondRouter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val args: SecondFragmentArgs,
    @DebugLoggerQualifier private val logger: CustomLogger
) : ViewModel() {

    init {
        logger.log("Second fragment built!")
    }

    fun loadUser() = viewModelScope.launch {
        val user = args.provideUser()
        logger.log("User: $user")
    }

    fun onNextClicked(router: SecondRouter) =
        router.navigateToFirstFragment()
}
