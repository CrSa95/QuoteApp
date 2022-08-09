package com.example.myapplication.model

class QuoteProvider {
    companion object {

        fun random() : QuoteModel{
            val position = (0..3).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel (
                quote = "Si estas preocupada, no te preocupes",
                author = "El Chemms"
                    ),
            QuoteModel (
                quote = "Si te sientes mal, sientate bien",
                author = "El Chemms"
                    ),
            QuoteModel (
                quote = "Tenes resfriado de patas",
                author = "El Pato"
            ),
            QuoteModel (
                quote = "Hueles a pata lavatelas",
                author = "El Pato"
            )
        )
    }
}