package com.jakmos.hiltguide.presentation.first

import androidx.lifecycle.ViewModel
import com.jakmos.hiltguide.domain.logger.CustomLogger
import com.jakmos.hiltguide.domain.logger.VerboseLoggerQualifier
import com.jakmos.hiltguide.presentation.utils.TextSetter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    @VerboseLoggerQualifier private val logger: CustomLogger
) : ViewModel() {

    fun init() {
        logger.log("First fragment built!")
    }

    fun onNextClicked(router: FirstRouter) =
        router.navigateToSecondFragment("2")

    fun onGenerateClicked(textSetter: TextSetter?) =
        textSetter?.setText(getLoremIpsum())

    private fun getLoremIpsum() = listOf(
        "Lorem",
        "ipsum",
        "dolor",
        "sit",
        "amet",
        "consectetur",
        "adipiscing",
        "elit",
        "phasellus",
        "dictum",
        "pellentesque",
        "turpis",
        "tempor",
        "cursus",
        "donec",
    ).shuffled().joinToString(separator = " ")
}
