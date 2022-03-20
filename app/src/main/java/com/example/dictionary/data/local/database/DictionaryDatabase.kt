package com.example.dictionary.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dictionary.data.local.model.entities.WordItemEntity
import com.example.dictionary.data.local.utils.Converters

@Database(
    entities = [WordItemEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class DictionaryDatabase : RoomDatabase() {
    abstract fun dictionaryDao(): DictionaryDao

    companion object {
        const val DATABASE_NAME = "dictionary_db"
    }
}