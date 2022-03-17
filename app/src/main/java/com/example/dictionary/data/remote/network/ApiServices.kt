package com.example.dictionary.data.remote.network

import com.example.dictionary.data.remote.model.WordItemDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {
    @GET("v2/entries/en/{searchedWord}")
    suspend fun getWordItem(@Path("searchedWord") searchedWord: String): List<WordItemDTO>
}