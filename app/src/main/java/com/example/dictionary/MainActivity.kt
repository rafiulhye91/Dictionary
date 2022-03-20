package com.example.dictionary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val db =
            Room.databaseBuilder(applicationContext, DictionaryDatabase::class.java, DATABASE_NAME)
                .build()
        val api = RetrofitInstance.getApiServices()
//        lifecycleScope.launch {
//        // Coroutine ...
//            val items = api.getWordItem("Bank")
//            Log.d("test api", items.toString())
//            db.dictionaryDao().insertWord(words = items.map { it.toWordItemEntity() })
//
//            val words = db.dictionaryDao().getWordInfo("Bank")
//            Log.d("test db", words.toString())
//        }
        lifecycleScope.launch {
            // Coroutine ...
            //
            val meaning: MutableList<Meaning> = mutableListOf()
            val antonyms: List<String> = listOf("Abc", "Xyz", "Pqr")
            val synonyms: List<String> = listOf("Abc", "Xyz", "Pqr")
            meaning.add(Meaning("parts of speech", antonyms, synonyms))

            val wordentitys: MutableList<WordItemEntity> = mutableListOf()
            val wordEntity:WordItemEntity = WordItemEntity(word = "bank", phonetic = "phonetic",meaning =meaning )
            wordentitys.add(wordEntity)
            db.dictionaryDao().insertWord(wordentitys)
            val words = db.dictionaryDao().getAllWords()
            Log.d("test db", words.toString())
        }
*/
    }
}