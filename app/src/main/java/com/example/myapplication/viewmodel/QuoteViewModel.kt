package com.example.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.QuoteModel
import com.example.myapplication.model.QuoteProvider

class QuoteViewModel : ViewModel(){

    //Is mutable because changed in time
    val quoteModel = MutableLiveData<QuoteModel>()

    //Generate a random quote
    fun randomQuote(){

        //Call for random quote
        val currentQuote : QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}