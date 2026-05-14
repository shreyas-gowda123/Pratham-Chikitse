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
    val steps: Map<String, List<EmergencyStep>>
)

enum class Language(val code: String, val displayName: String) {
    ENGLISH("en", "English"),
    KANNADA("kn", "ಕನ್ನಡ (Kannada)"),
    HINDI("hi", "हिन्दी (Hindi)")
}
