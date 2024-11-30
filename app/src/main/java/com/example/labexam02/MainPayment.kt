package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainPayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_payment)

        val homebutton = findViewById<ImageButton>(R.id.home)
        val searchbutton = findViewById<ImageButton>(R.id.search)
        val profilebutton = findViewById<ImageButton>(R.id.profile)

        homebutton.setOnClickListener {
            startActivity(Intent(this, MainHome::class.java))
        }
        searchbutton.setOnClickListener{
            startActivity(Intent(this,MainSearch::class.java))
        }
        profilebutton.setOnClickListener{
            startActivity(Intent(this,MainProfile::class.java))
        }
    }
}