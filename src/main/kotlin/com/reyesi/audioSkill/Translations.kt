package com.reyesi.audioSkill

object Translations {

    enum class TranslationKey {
        WELCOME, HELP, THANKS, FALLBACK, NO_FEATURE, CANCEL
    }

    fun getMessage(language: String, messageKey: TranslationKey) =
        messages.getValue(language)[messageKey]
            ?: messages.getValue("en")[messageKey]

    private val messages = mapOf(
        "es" to mapOf(
            TranslationKey.WELCOME to "Grazas por usar esta skill, vamos a poñerche a emisión en directo de Radio Galega Música!",
            TranslationKey.HELP to "Está skill para escoitar radio Galega Música foi desarrollada por ManuReyesi. Para usar esta skill simplemente tienes que invocarla y reproducirá el audio. ¿Quieres que lo reproduzca?",
            TranslationKey.THANKS to "¡Gracias por usar esta skill!",
            TranslationKey.FALLBACK to "Vaya, algo ha ido mal. Inténtalo más tarde",
            TranslationKey.CANCEL to "Moitas grazas por escoitar radio Galega Música. Ata a próxima.",
            TranslationKey.NO_FEATURE to "Vaya, no puedo cambiar de audio, lo siento"
        ),
        "en" to mapOf(
            TranslationKey.WELCOME to "Thank you for using this skill, we are going to give you the live broadcast of Radio Galega Música!",
            TranslationKey.HELP to "To use this skill just invoke it and the audio will be played right away. Do you want me to play the audio now?",
            TranslationKey.THANKS to "Thank your for using this skill!",
            TranslationKey.FALLBACK to "Ups, there is some problem here. Please, try later again.",
            TranslationKey.CANCEL to "Bye.",
            TranslationKey.NO_FEATURE to "Ups, I cannot change the audio. It is just a radio streaming. Sorry"
        )
    )
}
