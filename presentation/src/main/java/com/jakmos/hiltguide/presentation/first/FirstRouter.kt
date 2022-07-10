package com.jakmos.hiltguide.presentation.first

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jakmos.hiltguide.presentation.R
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class FirstRouter @Inject constructor(
    private val fragment: Fragment
) {

    fun navigateToSecondFragment(userId: String) =
        fragment.findNavController().navigate(
            R.id.navigateToSecondFragment,
            bundleOf("userId" to userId)
        )
}
