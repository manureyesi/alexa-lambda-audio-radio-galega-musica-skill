package com.reyesi.audioSkill.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.request.Predicates.intentName
import com.reyesi.audioSkill.Translations
import com.reyesi.audioSkill.getLanguage

class HelpIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput) = input.matches(intentName("AMAZON.HelpIntent"))

    override fun handle(input: HandlerInput) = input.responseBuilder
        .withSpeech(Translations.getMessage(input.getLanguage(), Translations.TranslationKey.HELP))
        .withShouldEndSession(false)
        .build()
}
