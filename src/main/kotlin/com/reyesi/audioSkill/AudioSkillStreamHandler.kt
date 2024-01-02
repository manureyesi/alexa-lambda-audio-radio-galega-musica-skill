package com.reyesi.audioSkill

import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.reyeStopIntentsi.audioSkill.interceptor.LogRequestInterceptor
import com.reyesi.audioSkill.handler.*
import com.reyesi.audioSkill.handler.playback.*
import com.reyesi.audioSkill.interceptor.LogResponseInterceptor

class AudioSkillStreamHandler : SkillStreamHandler(skill) {
    companion object {
        private val skill = Skills.standard()
            .addRequestInterceptor(LogRequestInterceptor())
            .addResponseInterceptor(LogResponseInterceptor())
            .addRequestHandlers(
                PlayTheAudioHandler(),
                ResumeIntentHandler(),
                HelpIntentHandler(),
                PlaybackStoppedHandler(),
                PlaybackFailureHandler(),
                PlaybackFinishedHandler(),
                PlaybackNearlyFinishedHandler(),
                PlaybackStartedHandler(),
                RepeatAndStartOverIntentHandler(),
                CancelAndStopIntentHandler(),
                NextAndPreviousIntentHandler(),
                FallbackIntentHandler(),
                SystemExceptionEncounterHandler(),
                SessionEndedRequestHandler()
            )
            .build()
    }
}
