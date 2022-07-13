package com.jakmos.hiltguide.presentation.utils

import javax.inject.Inject

class PokemonFormatter @Inject constructor() {

    fun format(text: String): String =
        text.mapIndexed { index, char ->
            if (index % 2 == 0) char.uppercase()
            else char.toString()
        }.joinToString(separator = "")
}
