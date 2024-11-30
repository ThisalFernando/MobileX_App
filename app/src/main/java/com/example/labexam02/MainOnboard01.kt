package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainOnboard01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_onboard01)

        val arrowbutton = findViewById<ImageButton>(R.id.arrow)
        val skipbutton = findViewById<Button>(R.id.skip)

        arrowbutton.setOnClickListener {
            startActivity(Intent(this, MainOnboard02::class.java))
        }
        skipbutton.setOnClickListener{
            startActivity(Intent(this, MainHome::class.java))
        }
    }
}