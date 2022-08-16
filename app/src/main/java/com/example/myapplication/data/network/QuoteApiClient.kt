package com.example.myapplication.data.network

import com.example.myapplication.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface QuoteApiClient {

    @GET("Quotes.json?alt=media&token=dd525264-62b8-4b2a-9749-1527794f852a")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}