package com.example.dictionary.data.remote.model

import com.example.dictionary.domain.model.Meaning
import com.google.gson.annotations.SerializedName

data class MeaningDTO(
    @SerializedName("antonyms")
    val antonyms: List<String>?,
    @SerializedName("definitions")
    val definitionDTOs: List<DefinitionDTO>?,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String?,
    @SerializedName("synonyms")
    val synonyms: List<String>?
) {
    fun toMeaning(): Meaning {
        return Meaning(
            partOfSpeech = this.partOfSpeech,
            antonyms = this.antonyms,
            synonyms = this.synonyms
        )
    }
}