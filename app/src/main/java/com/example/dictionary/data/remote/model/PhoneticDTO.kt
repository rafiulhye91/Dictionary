package com.example.dictionary.data.remote.model

import com.google.gson.annotations.SerializedName

data class PhoneticDTO(
    @SerializedName("audio")
    val audio: String?,
    @SerializedName("sourceUrl")
    val sourceUrl: String?,
    @SerializedName("text")
    val text: String?
)