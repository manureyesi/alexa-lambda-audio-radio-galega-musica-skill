package com.reyesi.audioSkill.interceptor

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.interceptor.ResponseInterceptor
import com.amazon.ask.model.Response
import com.amazon.ask.util.JacksonSerializer
import java.util.*

class LogResponseInterceptor : ResponseInterceptor {
    override fun process(input: HandlerInput, response: Optional<Response>) {
        response.ifPresent {
            println("Response: ${JacksonSerializer().serialize(it)}")
        }
    }
}
