package com.example.ch4challangehabioo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ch4challangehabioo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.ivRefresh.setOnClickListener{
            val intent = intent
            finish()
            startActivity(intent)
        }
    }
}