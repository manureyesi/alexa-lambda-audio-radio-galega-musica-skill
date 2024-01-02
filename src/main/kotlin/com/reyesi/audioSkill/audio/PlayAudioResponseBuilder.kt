package com.reyesi.audioSkill.audio

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.model.Response
import com.amazon.ask.model.interfaces.audioplayer.PlayBehavior
import com.reyesi.audioSkill.AUDIO_URL
import com.reyesi.audioSkill.FALLBACK_AUDIO_URL
import com.reyesi.audioSkill.Translations
import com.reyesi.audioSkill.getLanguage
import java.util.*

object PlayAudioResponseBuilder {
    fun buildAudioResponse(input: HandlerInput, offsetInMilliseconds: Long? = 0L): Optional<Response> {

        return input.responseBuilder
                .withSpeech(Translations.getMessage(input.getLanguage(), Translations.TranslationKey.WELCOME))
            .addAudioPlayerPlayDirective(
                PlayBehavior.REPLACE_ALL,
                offsetInMilliseconds,
                null,
                "audioSkill",
                System.getenv(AUDIO_URL)
            )
            .build()
    }

    fun buildFallbackResponse(input: HandlerInput): Optional<Response> {
        return input.responseBuilder
            .addAudioPlayerPlayDirective(
                PlayBehavior.REPLACE_ALL,
                0L,
                null,
                "audioSkill",
                System.getenv(FALLBACK_AUDIO_URL)
            )
            .build()
    }
}
