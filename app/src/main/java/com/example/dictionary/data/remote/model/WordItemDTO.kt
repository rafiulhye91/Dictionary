package com.example.dictionary.data.remote.model

import com.google.gson.annotations.SerializedName

data class WordItemDTO(
    @SerializedName("meanings")
    val meaningDTOS: List<MeaningDTO>,
    @SerializedName("phonetic")
    val phonetic: String,
    @SerializedName("phonetics")
    val phoneticDTOs: List<PhoneticDTO>,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>,
    @SerializedName("word")
    val word: String
)