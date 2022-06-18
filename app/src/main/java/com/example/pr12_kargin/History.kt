package com.example.pr12_kargin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val btnBackToMenus = findViewById<ImageView>(R.id.btnBackToMenus)
        btnBackToMenus.setOnClickListener{
            val openMenus = Intent(this, Menus::class.java)
            startActivity(openMenus)
        }

    }
}