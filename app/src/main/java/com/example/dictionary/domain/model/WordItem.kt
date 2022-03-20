package com.example.dictionary.domain.model

import com.example.dictionary.data.local.model.entities.WordItemEntity

data class WordItem(
    val phonetic: String?,
    val sourceUrls: List<String>?,
    val word: String?,
    val meaningList: List<Meaning>
)