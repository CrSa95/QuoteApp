package com.example.myapplication.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    //binding
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //init binding and inflate the view
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Home.setOnClickListener{
            showQuotes()
        }
    }

    private fun showQuotes(){
        val quotesIntent = Intent(this, QuotesActivity::class.java)
        startActivity(quotesIntent)
    }
}