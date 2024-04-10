package com.qualitybitz.booksearchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.qualitybitz.booksearchapp.sungWook.ApiClient
import kotlinx.coroutines.launch

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val apiService = ApiClient.api
        lifecycleScope.launch {
            val response = apiService.getData("a070dff325304baaacac50d1c77b6a7e")
            Log.d("dads", response.toString())
        }

    }
}