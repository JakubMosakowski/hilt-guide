package com.jakmos.hiltguide.presentation.first

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor() : ViewModel() {

    fun print() {
        Log.v("KUBA", "Print from VM")
    }
}
