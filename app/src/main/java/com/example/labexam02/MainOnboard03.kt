package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainOnboard03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_onboard03)

        val getstartedbutton = findViewById<Button>(R.id.getStarted)
        val arrowbutton = findViewById<ImageButton>(R.id.arrow)

        arrowbutton.setOnClickListener {
            startActivity(Intent(this, MainHome::class.java))
        }
        getstartedbutton.setOnClickListener{
            startActivity(Intent(this,MainHome::class.java))
        }
    }
}