package com.example.pppbbottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pppbbottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "TravelApp"
        with(binding){
            val navController =findNavController(R.id.nav_host_fragment)
            bottomNavView.setupWithNavController(navController)
        }
    }
}