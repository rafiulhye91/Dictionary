package com.example.dictionary.data.local.database

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.dictionary.data.local.model.entities.WordItemEntity

@Dao
interface DictionaryDao {
    @Transaction
    @Query("SELECT * FROM worditementity WHERE word==:word")
    suspend fun getWordInfo(word: String): List<WordItemEntity>

    @Insert(onConflict = REPLACE)
    suspend fun insertWord(words: List<WordItemEntity>): Long

    @Delete
    suspend fun deleteTask(word: WordItemEntity)

    @Update
    suspend fun updateTask(word: WordItemEntity)
}