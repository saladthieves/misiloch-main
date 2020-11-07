package com.gebeya.framework.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    lateinit var instance: Retrofit

    fun getRetrofit() : Retrofit {
        if (!this::instance.isInitialized) {
            instance = createRetrofit()
        }

        return instance
    }

    private fun createRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}