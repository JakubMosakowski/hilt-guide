package com.jakmos.hiltguide.data.di

import android.util.Log
import com.jakmos.hiltguide.domain.KubaLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal class LoggerModule {

    @Provides
    fun providesLogger(): KubaLogger =
        KubaLogger { message -> Log.v("KUBA", message) }
}
