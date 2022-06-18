package com.example.pr12_kargin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Registration : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnCreateAcc = findViewById<TextView>(R.id.btnCreateAcc)
        btnCreateAcc.setOnClickListener{
            val openReg_acc = Intent(this, reg_new_acc::class.java)
            startActivity(openReg_acc)
        }
        val btnSign = findViewById<Button>(R.id.btnSign)
        btnSign.setOnClickListener{
            val openStart = Intent(this,  Start_Screen::class.java)
            startActivity(openStart)
        }
    }
}