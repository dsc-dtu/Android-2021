package com.dtu.dsc.retrofittutorial.Networking

import com.dtu.dsc.retrofittutorial.Models.UserItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    companion object {

/*        fun getAPIService(): RetrofitService = Retrofit.Builder().baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitService::class.java)*/
    }


    @GET("users")
    fun getUsers(): Call<List<UserItem>>
}