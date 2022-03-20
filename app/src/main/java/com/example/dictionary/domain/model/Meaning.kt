package com.example.dictionary.domain.model

data class Meaning(
    val partOfSpeech: String?,
    val antonyms: List<String>?,
    val synonyms: List<String>?
)