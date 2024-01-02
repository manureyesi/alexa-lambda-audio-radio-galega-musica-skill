package com.reyesi.audioSkill.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import com.amazon.ask.request.Predicates.intentName
import com.reyesi.audioSkill.audio.PlayAudioResponseBuilder
import java.math.BigDecimal
import java.util.*

class ResumeIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput) = input.matches(intentName("AMAZON.ResumeIntent"))

    override fun handle(input: HandlerInput): Optional<Response> {
        return PlayAudioResponseBuilder.buildAudioResponse(input)
    }

}
