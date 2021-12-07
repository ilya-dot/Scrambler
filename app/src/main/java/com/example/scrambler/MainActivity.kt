package com.example.scrambler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scrambler.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var scramblerViewModel = ScramblerViewModel()
        binding.viewModel = scramblerViewModel
    }
}