package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainSearch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_search)

        val homebutton = findViewById<ImageButton>(R.id.home)
        val paymentbutton = findViewById<ImageButton>(R.id.payment)
        val profilebutton = findViewById<ImageButton>(R.id.profile)

        homebutton.setOnClickListener {
            startActivity(Intent(this, MainHome::class.java))
        }
        paymentbutton.setOnClickListener{
            startActivity(Intent(this,MainPayment::class.java))
        }
        profilebutton.setOnClickListener{
            startActivity(Intent(this,MainProfile::class.java))
        }
    }
}