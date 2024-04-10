package com.qualitybitz.booksearchapp.data.api

import android.util.Log
import com.qualitybitz.booksearchapp.util.Constants.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitInstance {

    private fun httpLoggingInterceptor(): Interceptor {
        return HttpLoggingInterceptor { message -> Log.e("MyOkHttpClient :", message + "") }
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    val client: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor())
            .build()
    }

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client)
            .baseUrl("https://openapi.gg.go.kr/")
            .build()
    }

    val api: BookSearchApi by lazy {
        retrofit.create(BookSearchApi::class.java)
    }
}