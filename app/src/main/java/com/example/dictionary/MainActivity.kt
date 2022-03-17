package com.example.dictionary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Testing purpose
        val api = RetrofitInstance.getApiServices()
        lifecycleScope.launch {
        // Coroutine ...
        val items = api.getWordItem("Bank")
        Log.d("test", items.toString())
        }
         */

    }
}