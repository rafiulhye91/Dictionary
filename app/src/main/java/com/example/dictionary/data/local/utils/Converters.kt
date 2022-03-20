package com.example.dictionary.data.local.utils

import androidx.room.TypeConverter
import com.example.dictionary.domain.model.Meaning
import com.google.gson.Gson

import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import kotlin.collections.ArrayList


object Converters {
    val gson = Gson()
    @TypeConverter
    fun fromString(value: String?): ArrayList<String?>? {
        val listType: Type = object : TypeToken<ArrayList<String?>?>() {}.type
        return gson.fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<String?>?): String? {
        return gson.toJson(list)
    }

    @TypeConverter
    fun stringToMeaning(data: String?): List<Meaning?>? {
        val listType = object : TypeToken<List<Meaning?>?>() {}.type
        return gson.fromJson<List<Meaning?>>(data, listType)
    }

    @TypeConverter
    fun meaningListToString(meanings: List<Meaning?>?): String? {
        return gson.toJson(meanings)
    }
}