package com.example.pr12_kargin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        val btnBook = findViewById<Button>(R.id.btn_book)
        btnBook.setOnClickListener{
            val openWait = Intent(this, wait_timer::class.java)
            startActivity(openWait)
        }




    }

}