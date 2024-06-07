package za.ac.iie.mdunge

package com.example.screensmart

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.screensmart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetailedView.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            startActivity(intent)
        }

        binding.btnClearData.setOnClickListener {
            clearData()
        }
    }

    private fun clearData() {
        // Clear the input fields
        binding.etMorningScreenTime.setText("")
        binding.etAfternoonScreenTime.setText("")
    }
}
