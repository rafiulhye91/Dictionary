package com.example.dictionary.domain.model

data class WordItem(
    val phonetic: String?,
    val word: String?,
    val meaningList: List<Meaning>
)