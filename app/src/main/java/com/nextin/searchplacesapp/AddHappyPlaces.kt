package com.nextin.searchplacesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nextin.searchplacesapp.databinding.ActivityAddHappyPlacesBinding

class AddHappyPlaces : AppCompatActivity() {
    private var binding:ActivityAddHappyPlacesBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlacesBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.addPlacesToolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding?.addPlacesToolBar?.setNavigationOnClickListener{
            onBackPressed()
        }


    }
}