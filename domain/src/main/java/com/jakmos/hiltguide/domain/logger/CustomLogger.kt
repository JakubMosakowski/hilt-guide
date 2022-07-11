package com.jakmos.hiltguide.domain.logger

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class VerboseLoggerQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DebugLoggerQualifier

interface CustomLogger {

    fun log(message: String)
}
