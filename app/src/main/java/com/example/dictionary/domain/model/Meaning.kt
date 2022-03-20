package com.example.dictionary.domain.model

data class Meaning(
    val partOfSpeech: String?,
    val antonyms: List<String>?,
    val synonyms: List<String>?
){
    fun toMeaningEntity():MeaningEntity{
        return MeaningEntity(
            partOfSpeech =  this.partOfSpeech,
            antonyms =  this.antonyms,
            synonyms = this.synonyms
        )
    }

}
