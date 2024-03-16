package com.example.latihan5pam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.google.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val firebaseAnalytics = FirebaseAnalytics.getInstance(this)
        }
    }
}