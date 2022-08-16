package com.example.myapplication.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.model.QuoteModel
import com.example.myapplication.data.model.QuoteProvider
import com.example.myapplication.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel(){

    //Is mutable because changed in time
    val quoteModel = MutableLiveData<QuoteModel>()

    val getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result =getQuotesUseCase()
            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
            }
        }
    }

    //Generate a random quote
    fun randomQuote(){

        //Call for random quote
        // val currentQuote : QuoteModel = QuoteProvider.random()
        // quoteModel.postValue(currentQuote)
    }

}