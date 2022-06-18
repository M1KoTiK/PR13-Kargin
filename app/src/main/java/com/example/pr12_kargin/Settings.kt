package com.example.pr12_kargin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backToMenus = findViewById<ImageView>(R.id.btnBackToMenus)
        backToMenus.setOnClickListener{
            val openMenus = Intent(this, Menus::class.java)
            startActivity(openMenus)
        }
    }
}