package com.jakmos.hiltguide.presentation.first

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor() : ViewModel() {

    fun onNextClicked(router: FirstRouter) =
        router.navigateToSecondFragment()
}
