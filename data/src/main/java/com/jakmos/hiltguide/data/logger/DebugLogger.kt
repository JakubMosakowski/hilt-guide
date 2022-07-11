package com.jakmos.hiltguide.data.logger

import android.util.Log
import com.jakmos.hiltguide.domain.logger.CustomLogger
import javax.inject.Inject

internal class DebugLogger @Inject constructor() : CustomLogger {

    override fun log(message: String) {
        Log.d("KUBA", message)
    }
}
