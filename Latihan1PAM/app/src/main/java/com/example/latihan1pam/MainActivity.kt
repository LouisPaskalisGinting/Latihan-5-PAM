package com.example.latihan1pam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan1pam.R

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter = findViewById<TextView>(R.id.textViewCounter)

        // Untuk set angka 0
        textViewCounter.text = counter.toString()

        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)

        buttonPlus.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }

        buttonMinus.setOnClickListener {
            counter--
            textViewCounter.text = counter.toString()
        }
    }
}