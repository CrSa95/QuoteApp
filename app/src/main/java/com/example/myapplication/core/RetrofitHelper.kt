package com.example.myapplication.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://firebasestorage.googleapis.com/v0/b/datos-86df3.appspot.com/o/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}