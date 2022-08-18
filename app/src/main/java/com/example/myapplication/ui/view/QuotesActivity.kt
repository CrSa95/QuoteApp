package com.example.myapplication.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.example.myapplication.databinding.ActivityQuotesBinding
import com.example.myapplication.ui.viewmodel.QuoteViewModel


class QuotesActivity : AppCompatActivity() {

    //binding
    private lateinit var binding: ActivityQuotesBinding

    //quoteViewModel
    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //init binding and inflate the view
        binding = ActivityQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        //Obtain a quote of my mutable live data and set this values in the textviews
        quoteViewModel.quoteModel.observe(this, Observer {

            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author

            if (binding.tvAuthor.text.toString() == "El Pato"){
                binding.chemms.visibility = android.view.View.INVISIBLE
                binding.pato.visibility = android.view.View.VISIBLE
            }

            else if (binding.tvAuthor.text.toString() == "El Chemms"){
                binding.pato.visibility = android.view.View.INVISIBLE
                binding.chemms.visibility = android.view.View.VISIBLE
            }

        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.progress.isVisible = it
        })

        //Put the random quote in the principal layout when this is clicked
        binding.viewContainer.setOnClickListener{
            quoteViewModel.randomQuote()
        }
    }
}