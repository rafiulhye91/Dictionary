package com.example.dictionary.data.remote.model

import com.google.gson.annotations.SerializedName

data class DefinitionDTO(
    @SerializedName("antonyms")
    val antonyms: List<String>?,
    @SerializedName("definition")
    val definition: String?,
    @SerializedName("synonyms")
    val synonyms: List<String>?
)