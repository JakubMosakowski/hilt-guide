package com.jakmos.hiltguide.data.di

import com.jakmos.hiltguide.data.logger.DebugLogger
import com.jakmos.hiltguide.data.logger.VerboseLogger
import com.jakmos.hiltguide.domain.logger.CustomLogger
import com.jakmos.hiltguide.domain.logger.DebugLoggerQualifier
import com.jakmos.hiltguide.domain.logger.VerboseLoggerQualifier
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class LoggerModule {

    @Binds
    @VerboseLoggerQualifier
    abstract fun bindVerboseLogger(
        verboseLogger: VerboseLogger
    ): CustomLogger

    @Binds
    @DebugLoggerQualifier
    abstract fun bindDebugLogger(
        debugLogger: DebugLogger
    ): CustomLogger
}
