package com.akshat.jindal.retrofittutorial

import com.akshat.jindal.retrofittutorial.Models.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    companion object {

        fun getAPIService() = Retrofit.Builder().baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitService::class.java)
    }


    @GET("users")
    fun getUsers(): List<User>
}