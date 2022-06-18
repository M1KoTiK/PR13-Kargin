package com.example.pr12_kargin

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoButton = findViewById<ImageView>(R.id.logo)
        logoButton.setOnClickListener{
            val openRegistration = Intent(this, Registration::class.java)
            startActivity(openRegistration)
        }

    }

}