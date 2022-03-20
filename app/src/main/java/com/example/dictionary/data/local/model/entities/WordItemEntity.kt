package com.example.dictionary.data.local.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dictionary.domain.model.Meaning
import com.example.dictionary.domain.model.WordItem

/**
 * @SerializedName("meanings")
val meaningDTOS: List<MeaningDTO>?,
@SerializedName("phonetic")
val phonetic: String?,
@SerializedName("phonetics")
val phoneticDTOs: List<PhoneticDTO>?,
@SerializedName("sourceUrls")
val sourceUrls: List<String>?,
@SerializedName("word")
val word: String?
 */
@Entity
data class WordItemEntity(
    @PrimaryKey(autoGenerate = true)
    val wordID: Int? = null,
    val phonetic: String?,
    val word: String?,
    val meaning: List<Meaning>
) {
    fun toWord(): WordItem {
        return WordItem(
            word = this.word,
            phonetic = this.phonetic,
            meaningList = this.meaning
        )
    }
}
