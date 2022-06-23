package com.example.pr12_kargin

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class drive_timer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drive_timer)
        val btnStop2 = findViewById<Button>(R.id.btn_stop2)
        btnStop2.setOnClickListener {
            val toast = Toast.makeText(this, "Thanks!", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 300) // import android.view.Gravity;

            toast.show()
        }



    }
}