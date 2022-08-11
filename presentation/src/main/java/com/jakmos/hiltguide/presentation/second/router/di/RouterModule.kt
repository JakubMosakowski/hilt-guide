package com.jakmos.hiltguide.presentation.second.router.di

import androidx.fragment.app.Fragment
import com.jakmos.hiltguide.presentation.R
import com.jakmos.hiltguide.presentation.second.router.SecondLargeRouter
import com.jakmos.hiltguide.presentation.second.router.SecondRouter
import com.jakmos.hiltguide.presentation.second.router.SecondSmallRouter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class RouterModule {

    @Provides
    fun providesSecondRouter(
        fragment: Fragment
    ): SecondRouter =
        if (fragment.isLargeFormFactor())
            SecondLargeRouter(fragment)
        else
            SecondSmallRouter(fragment)


    private fun Fragment.isLargeFormFactor(): Boolean =
        requireContext().resources.getBoolean(R.bool.is_large_form_factor)
}
