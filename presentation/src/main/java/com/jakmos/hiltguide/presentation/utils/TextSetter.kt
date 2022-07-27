package com.jakmos.hiltguide.presentation.utils

import android.widget.TextView
import com.jakmos.hiltguide.domain.utils.PokemonFormatter
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class TextSetter @AssistedInject constructor(
    @Assisted private val textView: TextView,
    private val pokemonFormatter: PokemonFormatter
) {

    fun setText(text: String) {
        textView.text = pokemonFormatter.format(text)
    }
}

@AssistedFactory
interface TextSetterFactory {

    fun create(textView: TextView): TextSetter
}
