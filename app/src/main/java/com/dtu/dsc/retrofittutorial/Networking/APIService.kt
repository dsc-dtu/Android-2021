package com.dtu.dsc.retrofittutorial.Networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIService {

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val API: RetrofitService by lazy { getRetrofit().create(RetrofitService::class.java) }
}