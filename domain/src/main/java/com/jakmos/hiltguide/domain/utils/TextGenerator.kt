package com.jakmos.hiltguide.domain.utils

import javax.inject.Inject

class TextGenerator @Inject constructor() {

    fun generate(): String = listOf(
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
