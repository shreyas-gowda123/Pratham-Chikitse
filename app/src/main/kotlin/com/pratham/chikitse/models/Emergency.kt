package com.pratham.chikitse.models

data class EmergencyStep(
    val text: String
)

data class EmergencyCategory(
    val id: String,
    val icon: String,
    val color: String,
    val title: Map<String, String>,
    val description: Map<String, String>,
    val symptoms: Map<String, List<String>> = emptyMap(),
    val steps: Map<String, List<EmergencyStep>>,
    val doNot: Map<String, List<String>> = emptyMap(),
    val preventionTips: Map<String, List<String>> = emptyMap()
)

enum class Language(val code: String, val displayName: String) {
    ENGLISH("en", "English"),
    KANNADA("kn", "ಕನ್ನಡ (Kannada)"),
    HINDI("hi", "हिन्दी (Hindi)")
}
