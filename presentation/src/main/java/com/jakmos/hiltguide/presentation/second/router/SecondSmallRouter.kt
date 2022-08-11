package com.jakmos.hiltguide.presentation.second.router

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jakmos.hiltguide.presentation.R

class SecondSmallRouter(
    private val fragment: Fragment
) : SecondRouter {

    override fun navigateToFirstFragment() =
        fragment.findNavController().navigate(R.id.navigateToFirstFragment).also {
            Log.v("KUBA", "Small screen navigation!")
        }
}

