package com.example.pr12_kargin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Menus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)

        val itemHistory = findViewById<LinearLayout>(R.id.itemHistory)
        itemHistory.setOnClickListener{
            val openHistory = Intent(this, History::class.java)
            startActivity(openHistory)
        }

        val itemSettings = findViewById<LinearLayout>(R.id.itemSettings)
        itemSettings.setOnClickListener{
            val openSettings = Intent(this, Settings::class.java)
            startActivity(openSettings)
        }


        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener{
            val openStart_Screen = Intent(this, Start_Screen::class.java)
            startActivity(openStart_Screen)
        }
    }
}