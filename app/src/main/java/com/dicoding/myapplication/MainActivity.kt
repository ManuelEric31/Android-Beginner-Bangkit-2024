package com.dicoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etGeneration = findViewById<EditText>(R.id.etGeneration)
        val btGeneration = findViewById<Button>(R.id.btGeneration)
        val tvGeneration = findViewById<TextView>(R.id.tvGeneration)

        btGeneration.setOnClickListener{
            var input = etGeneration.text.toString()
            val result = when (input.toInt()) {
                in 1946..1964 -> "Baby boomers"
                in 1965..1980 -> "Gen X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Gen Z"
                else -> "Bukan Generasi Kami"
            }

            tvGeneration.text = "Kamu generasi $result"
        }
    }
}