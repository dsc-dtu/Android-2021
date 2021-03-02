package com.akshat.jindal.retrofittutorial

import com.akshat.jindal.retrofittutorial.Models.UserItem
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {

    companion object {

        fun getAPIService() = Retrofit.Builder().baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitService::class.java)
    }


    @GET("users")
    fun getUsers(@Query("per_page") perPage: Int = 100): Call<List<UserItem>>
}