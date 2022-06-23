package com.example.pr12_kargin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class wait_timer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wait_timer)

        val btnStop = findViewById<Button>(R.id.btn_stop)
        btnStop.setOnClickListener{
            val openMenus = Intent(this, drive_timer::class.java)
            startActivity(openMenus)
        }
        val btnCancel = findViewById<Button>(R.id.btn_cancel)
        btnCancel.setOnClickListener{
            val openMenus = Intent(this, Start_Screen::class.java)
            startActivity(openMenus)
        }

    }
}