package com.example.dictionary.data.remote.model

import com.example.dictionary.data.local.model.entities.WordItemEntity
import com.example.dictionary.domain.model.WordItem
import com.google.gson.annotations.SerializedName

data class WordItemDTO(
    @SerializedName("meanings")
    val meaningDTOS: List<MeaningDTO>?,
    @SerializedName("phonetic")
    val phonetic: String?,
    @SerializedName("phonetics")
    val phoneticDTOs: List<PhoneticDTO>?,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>?,
    @SerializedName("word")
    val word: String?
) {
    fun toWord(): WordItem {
        return WordItem(
            word = this.word,
            phonetic = this.phonetic,
            meaningList = (this.meaningDTOS?.map { it.toMeaning() } ?: null)!!
        )
    }

    fun toWordItemEntity(): WordItemEntity {
        return WordItemEntity(
            word = this.word,
            phonetic = this.phonetic,
            meaning = (this.meaningDTOS?.map { it.toMeaning() } ?: null)!!
        )
    }
}