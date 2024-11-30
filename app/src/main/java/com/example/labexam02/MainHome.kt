package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        val searchbutton = findViewById<ImageButton>(R.id.search)
        val paymentbutton = findViewById<ImageButton>(R.id.payment)
        val profilebutton = findViewById<ImageButton>(R.id.profile)

        searchbutton.setOnClickListener{
            startActivity(Intent(this,MainSearch::class.java))
        }
        paymentbutton.setOnClickListener{
            startActivity(Intent(this,MainPayment::class.java))
        }
        profilebutton.setOnClickListener{
            startActivity(Intent(this,MainProfile::class.java))
        }
    }
}