package com.example.dictionary

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.dictionary.data.local.database.DictionaryDatabase
import com.example.dictionary.data.local.database.DictionaryDatabase.Companion.DATABASE_NAME
import com.example.dictionary.data.remote.network.RetrofitInstance
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val db = Room.databaseBuilder(applicationContext, DictionaryDatabase::class.java, DATABASE_NAME).build()
        val api = RetrofitInstance.getApiServices()
        lifecycleScope.launch {
        // Coroutine ...
            val items = api.getWordItem("Bank")
            Log.d("test api", items.toString())
//            db.dictionaryDao().insertWord(words = items.map { it.toWordItemEntity() })
//
//            val words = db.dictionaryDao().getWordInfo("Bank")
//            Log.d("test db", words.toString())
        }


    }
}