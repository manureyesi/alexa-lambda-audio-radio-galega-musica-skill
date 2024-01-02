package com.reyesi.audioSkill.handler.playback

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.model.interfaces.audioplayer.PlaybackStoppedRequest
import com.amazon.ask.request.Predicates
import java.util.*

class PlaybackStoppedHandler : RequestHandler {

    override fun canHandle(input: HandlerInput) =
        input.matches(Predicates.requestType(PlaybackStoppedRequest::class.java))


    override fun handle(input: HandlerInput): Optional<Response> {
        return input.responseBuilder.build()
    }
}
